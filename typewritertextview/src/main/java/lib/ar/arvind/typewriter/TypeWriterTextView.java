/*
 * Copyright 2019 ar-arvind

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lib.ar.arvind.typewriter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * <h3><b>Type Writer Animation effect for Android TextView.</b></h3>
 *
 * <b>GitHub URL:</b> <a href="https://github.com/ar-arvind/TypeWriterTextView">https://github.com/ar-arvind/TypeWriterTextView</a>
 *
 * @author ar-arvind
 * @version 1.0.1
 * @since 2019-07-28
 */

public class TypeWriterTextView extends AppCompatTextView {

    private CharSequence text;
    private int textLength, count, duration;

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (count != textLength) {
                count++;
                setText(text.subSequence(0, count));
                postDelayed(this, duration);
            } else {
                removeCallbacks(this);
            }
        }
    };

    public TypeWriterTextView(Context context) {
        super(context);
    }

    public TypeWriterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param text     Text to be displayed.
     * @param duration Animation duration in milliseconds.
     */
    public void typeText(@NonNull CharSequence text, int duration) {
        startTyping(text, duration);
    }

    /**
     * @param resourceId Text to be displayed using a string resource identifier.
     * @param duration   Animation duration in milliseconds.
     */
    public void typeText(@StringRes int resourceId, int duration) {
        startTyping(getResources().getString(resourceId), duration);
    }

    private void startTyping(@NonNull CharSequence text, int duration) {
        count = 0;
        this.duration = duration;
        this.text = text;
        if (TextUtils.isEmpty(text)) {
            return;
        }
        textLength = TextUtils.getTrimmedLength(text);
        if (textLength == 0) {
            return;
        }
        postDelayed(runnable, duration);
    }

}
