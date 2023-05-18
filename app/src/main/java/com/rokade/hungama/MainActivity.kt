package com.rokade.hungama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.rokade.hungama.navigation.SetupNavGraph
import com.rokade.hungama.ui.theme.HungamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HungamaTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}


