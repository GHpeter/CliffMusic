package cliffmusic.com.cliff.definedView;

import android.content.Context;
import android.widget.TextView;

import android.util.AttributeSet;

/**
 * Created by Peter on 2015/7/26.
 * 自定义textview控件
 */
public class AlwaysMarqueeTextView extends TextView {
    public AlwaysMarqueeTextView(Context context) {
        super(context);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attrs,
                                 int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
