package com.android.samples.donuttracker

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.Long

public class DonutListDirections private constructor() {
  private data class ActionDonutListToDonutEntryDialogFragment(
    public val itemId: Long = -1L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_donutList_to_donutEntryDialogFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("itemId", this.itemId)
        return result
      }
  }

  public companion object {
    public fun actionDonutListToDonutEntryDialogFragment(itemId: Long = -1L): NavDirections =
        ActionDonutListToDonutEntryDialogFragment(itemId)
  }
}
