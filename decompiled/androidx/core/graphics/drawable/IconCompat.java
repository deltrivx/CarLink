package androidx.core.graphics.drawable;

import a4.b;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f977b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f985j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f976a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f978c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f979d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f980e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f981f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f982g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f983h = k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f984i = null;

    public final String toString() {
        String str;
        int iIntValue;
        int i7;
        if (this.f976a == -1) {
            return String.valueOf(this.f977b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f976a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f976a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f977b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f977b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f985j);
                sb2.append(" id=");
                int i10 = this.f976a;
                if (i10 == -1 && (i7 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = this.f977b;
                    if (i7 >= 28) {
                        iIntValue = b.d(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e10) {
                            Log.e("IconCompat", "Unable to get icon resource", e10);
                            iIntValue = 0;
                        } catch (InvocationTargetException e11) {
                            Log.e("IconCompat", "Unable to get icon resource", e11);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f980e;
                }
                sb2.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f980e);
                if (this.f981f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f981f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f977b);
                break;
        }
        if (this.f982g != null) {
            sb2.append(" tint=");
            sb2.append(this.f982g);
        }
        if (this.f983h != k) {
            sb2.append(" mode=");
            sb2.append(this.f983h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
