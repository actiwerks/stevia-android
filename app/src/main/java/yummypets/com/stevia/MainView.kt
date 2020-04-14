package yummypets.com.stevia

import android.content.Context
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainView(context: Context) : ConstraintLayout(context) {

    var label = TextView(context)

    init {
        subviews(
            label
        )
        label.text = "Hello there"
    }
}