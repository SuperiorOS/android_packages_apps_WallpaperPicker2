package com.android.wallpaper.testing

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import com.android.wallpaper.model.CustomizationSectionController
import com.android.wallpaper.model.PermissionRequester
import com.android.wallpaper.model.WallpaperColorsViewModel
import com.android.wallpaper.model.WallpaperPreviewNavigator
import com.android.wallpaper.model.WorkspaceViewModel
import com.android.wallpaper.module.CurrentWallpaperInfoFactory
import com.android.wallpaper.module.CustomizationSections

/** Test implementation of [CustomizationSections] */
class TestCustomizationSections : CustomizationSections {
    override fun getRevampedUISectionControllersForScreen(
        screen: CustomizationSections.Screen?,
        activity: FragmentActivity?,
        lifecycleOwner: LifecycleOwner?,
        wallpaperColorsViewModel: WallpaperColorsViewModel?,
        workspaceViewModel: WorkspaceViewModel?,
        permissionRequester: PermissionRequester?,
        wallpaperPreviewNavigator: WallpaperPreviewNavigator?,
        sectionNavigationController:
            CustomizationSectionController.CustomizationSectionNavigationController?,
        savedInstanceState: Bundle?,
        wallpaperInfoFactory: CurrentWallpaperInfoFactory?
    ): MutableList<CustomizationSectionController<*>> {
        return arrayListOf()
    }

    override fun getAllSectionControllers(
        activity: FragmentActivity?,
        lifecycleOwner: LifecycleOwner?,
        wallpaperColorsViewModel: WallpaperColorsViewModel?,
        workspaceViewModel: WorkspaceViewModel?,
        permissionRequester: PermissionRequester?,
        wallpaperPreviewNavigator: WallpaperPreviewNavigator?,
        sectionNavigationController:
            CustomizationSectionController.CustomizationSectionNavigationController?,
        savedInstanceState: Bundle?
    ): MutableList<CustomizationSectionController<*>> {
        return arrayListOf()
    }
}
