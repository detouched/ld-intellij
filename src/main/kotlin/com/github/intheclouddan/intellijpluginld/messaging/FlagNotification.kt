package com.github.intheclouddan.intellijpluginld.messaging

interface FlagNotifier {
    fun notify(isConfigured: Boolean, flag: String)
    fun reinit()
}
