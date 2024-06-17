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
fun App() {
    MaterialTheme {
        Column(
            Modifier
                .background(color = Color.DarkGray)
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
            Text("Made with KMP", color = Color.Gray, fontSize = 12.sp)
            Spacer(Modifier.height(12.dp))
            LazyColumn {
                items(LinksProvider.items) {
                    HoverButton(linkItem = it)
                }
            }
            
        }
    }
}


