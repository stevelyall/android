package ca.binder.domain;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import ca.binder.R;

/**
 * @author Mitchell Hentges
 * @since 11/11/2015
 */
public class NullPhoto implements IPhoto {
    @Override
    public Drawable getDrawable(Context context) {
        return ContextCompat.getDrawable(context, R.drawable.defaultPhoto);
    }
}
