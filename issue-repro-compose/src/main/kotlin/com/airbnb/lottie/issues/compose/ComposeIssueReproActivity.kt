package com.airbnb.lottie.issues.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.RenderMode
import com.airbnb.lottie.compose.LottieAnimatable
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

class ComposeIssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }

    @Composable
    fun Content() {
        val c1 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la1))
        val c2 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la2))
        val c3 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la3))
        val c4 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la4))
        val c5 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la5))
        val c6 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la6))
        val c7 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la7))
        val c8 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la8))
        val c9 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la9))
        val c10 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la10))
        val c11 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la11))
        val c12 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la12))
        val c13 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la13))
        val c14 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la14))
        val c15 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la15))
        val c16 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la16))
        val c17 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.la17))

        // This works if set to RenderMode.SOFTWARE
        val currentRenderMode = RenderMode.AUTOMATIC

        Column() {
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c1,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c2,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c3,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )

            }
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c4,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c5,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c6,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c7,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c8,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c9,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c10,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c11,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c12,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c13,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c14,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c15,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
            Row(modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
                LottieAnimation(
                    composition = c16,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                LottieAnimation(
                    composition = c17,
                    iterations = LottieConstants.IterateForever,
                    renderMode = currentRenderMode,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
        }
    }
}
