package com.android.samples.donuttracker

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class DonutEntryDialogFragmentArgs(
  public val itemId: Long = -1L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("itemId", this.itemId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("itemId", this.itemId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DonutEntryDialogFragmentArgs {
      bundle.setClassLoader(DonutEntryDialogFragmentArgs::class.java.classLoader)
      val __itemId : Long
      if (bundle.containsKey("itemId")) {
        __itemId = bundle.getLong("itemId")
      } else {
        __itemId = -1L
      }
      return DonutEntryDialogFragmentArgs(__itemId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        DonutEntryDialogFragmentArgs {
      val __itemId : Long?
      if (savedStateHandle.contains("itemId")) {
        __itemId = savedStateHandle["itemId"]
        if (__itemId == null) {
          throw IllegalArgumentException("Argument \"itemId\" of type long does not support null values")
        }
      } else {
        __itemId = -1L
      }
      return DonutEntryDialogFragmentArgs(__itemId)
    }
  }
}
