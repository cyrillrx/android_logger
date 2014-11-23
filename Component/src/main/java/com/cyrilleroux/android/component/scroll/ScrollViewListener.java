package com.cyrilleroux.android.component.scroll;

import android.widget.ScrollView;

/**
 * @author Cyril Leroux
 *         Created 22/11/2014.
 */
public interface ScrollViewListener {

    void onScrollChanged(ScrollView scrollView, int x, int y, int oldX, int oldY);

}