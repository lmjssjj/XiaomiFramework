package d.k.a;

import android.view.animation.Interpolator;

public class p implements Interpolator {
    public float getInterpolation(float f) {
        return ((float) (Math.cos(((double) f) * 3.141592653589793d) - 1.0d)) * -0.5f;
    }
}