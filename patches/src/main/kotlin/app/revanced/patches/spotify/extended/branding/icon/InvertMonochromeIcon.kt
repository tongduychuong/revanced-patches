package app.revanced.patches.spotify.extended.branding.icon

import app.revanced.patcher.patch.resourcePatch
import app.revanced.util.ResourceGroup
import app.revanced.util.copyResources

@Suppress("unused")
val invertMonochromeIcon = resourcePatch(
    "Invert adaptive theme icon for Spotify",
    "Inverts adaptive theme icon for Spotify.",
    false,
) {
    execute {
        copyResources(
            "spotify/branding/monochrome",
            ResourceGroup(
                "drawable",
                "ic_launcher_emerald_green_foreground.xml",
                "ic_launcher_renaissance_foreground.xml",
            )
        )
    }
}
