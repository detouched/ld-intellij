package com.github.intheclouddan.intellijpluginld

import com.github.intheclouddan.intellijpluginld.messaging.ConfigurationNotifier
import com.github.intheclouddan.intellijpluginld.messaging.DefaultMessageBusService
import com.github.intheclouddan.intellijpluginld.settings.LaunchDarklyConfig
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.util.concurrency.EdtExecutorService
import com.launchdarkly.api.model.FeatureFlags
import java.util.concurrent.TimeUnit

/*
 * Instance to provide other classes access to LaunchDarkly Flag Metadata.
 * Handles refreshing of the flags.
 */
@Service
class FlagStore(project: Project) {
    var flags: FeatureFlags
    private val messageBusService = project.service<DefaultMessageBusService>()

    fun flags(project: Project, settings: LaunchDarklyConfig.ConfigState): FeatureFlags {
        val envList = listOf(settings.environment)
        val ldProject: String = settings.project
        println(envList)
        println(ldProject)
        val getFlags = LaunchDarklyApiClient.flagInstance(project)
        return getFlags.getFeatureFlags(ldProject, envList, false, null, null, null, null, null, null)
    }

    fun flagsNotify(project: Project, settings: LaunchDarklyConfig.ConfigState): FeatureFlags {
        val publisher = project.messageBus.syncPublisher(messageBusService.flagsUpdatedTopic)
        flags = flags(project, settings)
        publisher.notify(true)
        return flags
    }

    init {
        val settings = LaunchDarklyConfig.getInstance(project).ldState
        var refreshRate: Long = settings.refreshRate.toLong()
        flags = flagsNotify(project, settings)
        EdtExecutorService.getScheduledExecutorInstance().scheduleWithFixedDelay({ flags = flagsNotify(project, settings) }, refreshRate, refreshRate, TimeUnit.MINUTES)
        project.messageBus.connect().subscribe(messageBusService.configurationEnabledTopic,
                object : ConfigurationNotifier {
                    override fun notify(isConfigured: Boolean) {
                        println("notified")
                        if (isConfigured) {
                            flags = flagsNotify(project, settings)
                        }
                    }
                })
    }

}