package yescorp.com.tuixiangzi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by 612226 on 2016/7/1.
 */
public  class GameBitmaps {
    public static  Bitmap mWallBitmap;
    public static  Bitmap mManBitmap;
    public static  Bitmap mBoxBitmap;
    public static  Bitmap mFlagBitmap;
    public static  Bitmap mUpBitmap;
    public static  Bitmap mDownBitmap;
    public static  Bitmap mRightBitmap;
    public static  Bitmap mLeftBitmap;
    public static  Bitmap mDoneBitmap;
    public static  Bitmap mBtnNextBitmap;
    public static  Bitmap mBtnExitBitmap;
    public static  Bitmap mBtnResetBitmap;
    public static Bitmap mBtnPrevBitmap;

    public static void loadBitmaps(Resources res) {
        if (mBoxBitmap == null)
            mBoxBitmap = BitmapFactory.decodeResource(res, R.drawable.box_48x48);
        if (mManBitmap == null)
            mManBitmap = BitmapFactory.decodeResource(res, R.drawable.eggman_48x48);
        if (mFlagBitmap == null)
            mFlagBitmap = BitmapFactory.decodeResource(res, R.drawable.flag_48x48);
        if (mWallBitmap == null)
            mWallBitmap = BitmapFactory.decodeResource(res, R.drawable.wall_48x48);
        if (mUpBitmap == null)
            mUpBitmap = BitmapFactory.decodeResource(res, R.drawable.up_48x48);
        if (mDownBitmap == null)
            mDownBitmap = BitmapFactory.decodeResource(res, R.drawable.down_48x48);
        if (mRightBitmap == null)
            mRightBitmap = BitmapFactory.decodeResource(res, R.drawable.right_48x48);
        if (mLeftBitmap == null)
            mLeftBitmap = BitmapFactory.decodeResource(res, R.drawable.left_48x48);
        if (mDoneBitmap == null)
            mDoneBitmap = BitmapFactory.decodeResource(res, R.drawable.done_72x72);
        if (mBtnNextBitmap == null)
            mBtnNextBitmap = BitmapFactory.decodeResource(res, R.drawable.btn_next_level);
        if (mBtnResetBitmap == null)
            mBtnResetBitmap = BitmapFactory.decodeResource(res, R.drawable.btn_reset);
        if (mBtnExitBitmap == null)
            mBtnExitBitmap = BitmapFactory.decodeResource(res, R.drawable.btn_exit);
        if (mBtnPrevBitmap == null)
            mBtnPrevBitmap = BitmapFactory.decodeResource(res, R.drawable.btn_prev_level);
    }
}
