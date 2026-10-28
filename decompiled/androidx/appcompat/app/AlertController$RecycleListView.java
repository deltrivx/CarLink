package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import i.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f607b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6562t);
        this.f607b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f606a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
