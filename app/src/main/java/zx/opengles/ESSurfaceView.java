package zx.opengles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 @author Marek Kulawiak
 */

class ESSurfaceView extends GLSurfaceView
{
	protected GLRenderer renderer=null;
    private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private float previousX;
    private float previousY;

    public ESSurfaceView(Context context)
    {
        super(context);

        // Stworzenie kontekstu OpenGL ES 2.0.
        setEGLContextClientVersion(2);

        // Przypisanie renderera do widoku.
        renderer = new GLRenderer();
        renderer.setContext(getContext());
        setRenderer(renderer);
    }
    
    public GLRenderer getRenderer()
    {
    	return renderer;
    }


    //zadanie 3. lab5
//    @SuppressLint("ClickableViewAccessibility")
//    @Override
//    public boolean onTouchEvent(MotionEvent e) {
//        float x = e.getX();
//        float y = e.getY();
//        if (e.getAction() == MotionEvent.ACTION_MOVE) {
//            float dx = x - previousX;
//            float dy = y - previousY;
//
//            renderer.setMotion(dx, dy);
//            requestRender();
//        }
//
//        previousX = x;
//        previousY = y;
//        return true;
//    }
}
