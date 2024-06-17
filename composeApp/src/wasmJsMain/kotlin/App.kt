import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource

import linktree.composeapp.generated.resources.Res
import linktree.composeapp.generated.resources.cropped_image
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun app() {
    MaterialTheme {
        Column(
            Modifier
                .background(
                    brush = GradientBackgroundBrush (
                        isVerticalGradient = false,
                        colors = gradientColors
                    )
                )
                .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(30.dp))
            Image(
                painterResource(Res.drawable.cropped_image), null,
                modifier = Modifier
                    .height(280.dp)
                    .clip(CircleShape)
            )
            Spacer(Modifier.height(8.dp))
            Text("@alesguga", fontSize = 30.sp, color = Color.White, fontWeight = FontWeight.W700)
            Spacer(Modifier.height(8.dp))
            Text("Made with KMP", color = Color.White, fontSize = 14.sp)
            Spacer(Modifier.height(12.dp))
            LazyColumn {
                items(LinksProvider.items) {
                    HoverButton(linkItem = it)
                }
            }
            
        }
    }
}

@Composable
private fun GradientBackgroundBrush(
    isVerticalGradient: Boolean,
    colors: List<Color>
): Brush {
    val endOffset = if (isVerticalGradient) {
        Offset(0f, Float.POSITIVE_INFINITY)
    } else {
        Offset(Float.POSITIVE_INFINITY, 0f)
    }

    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )


}
val gradientColors = listOf(
    Color(0xFF405DE6),
    Color(0xFF5851DB),
    Color(0xFF833AB4),
    Color(0xFFC13584),
    Color(0xFFE1306C),
    Color(0xFFFD1D1D)
)