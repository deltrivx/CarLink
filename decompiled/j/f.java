package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.baidu.carlifevehicle.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f6773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f6774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f6775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f6776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f6777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f6778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f6779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f6780j;
    public ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f6782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListAdapter f6784o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final android.support.v4.media.session.i f6791v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6785p = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f6792w = new a(0, this);

    public f(Context context, h hVar, Window window) {
        this.f6771a = context;
        this.f6772b = hVar;
        this.f6773c = window;
        android.support.v4.media.session.i iVar = new android.support.v4.media.session.i();
        iVar.f583b = new WeakReference(hVar);
        this.f6791v = iVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f6548e, R.attr.alertDialogStyle, 0);
        this.f6786q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f6787r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6788s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f6789t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f6790u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        hVar.c().f(1);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
