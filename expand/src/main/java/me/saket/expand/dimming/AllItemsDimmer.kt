package me.saket.expand.dimming

import android.graphics.Canvas
import me.saket.expand.InboxRecyclerView

/**
 * Draws dimming on the entire [InboxRecyclerView]. Unlike [UncoveredItemsDimmer],
 * this requires the page to have its own background, but is a safer option because
 * it involve any coordinate calculations.
 */
class AllItemsDimmer(dimColor: Int, maxDimRatio: Float) : UncoveredItemsDimmer(dimColor, maxDimRatio) {

  override fun drawDimming(canvas: Canvas) {
    recyclerView.apply {
      canvas.drawRect(0F, 0F, right.toFloat(), bottom.toFloat(), dimPaint)
    }
  }
}