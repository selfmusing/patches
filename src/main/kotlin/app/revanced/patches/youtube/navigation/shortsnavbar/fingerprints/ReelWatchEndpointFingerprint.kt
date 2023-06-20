package app.revanced.patches.youtube.navigation.shortsnavbar.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint

object ReelWatchEndpointFingerprint : MethodFingerprint(
    returnType = "V",
    customFingerprint = { it, _ -> it.name == "<init>" }
)