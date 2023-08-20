package com.securevpn.jc_navigation

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.securevpn.jc_navigation.ui.theme.JC_NavigationTheme
import com.securevpn.jc_navigation.viewModel.IntroViewModel

@Composable
fun MainCompose(
    navController: NavController = rememberNavController(),
    drawerState: DrawerState = rememberDrawerState(
        initialValue =
        DrawerValue.Closed,
    ),
    vm: IntroViewModel = hiltViewModel()

) {
    JC_NavigationTheme{
        Surface {
            ModalNavigationDrawer(
                drawerState = drawerState,
                drawerContent = {

                }) {

            }
        }
    }
}