package androidx.appcompat.view.menu;

import a2.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.a0;
import o.l;
import o.m;
import o.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f618b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f619a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b bVarP = b.P(context, attributeSet, f618b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(bVarP.D(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(bVarP.D(1));
        }
        bVarP.V();
    }

    @Override // o.a0
    public final void a(m mVar) {
        this.f619a = mVar;
    }

    @Override // o.l
    public final boolean b(o oVar) {
        return this.f619a.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j5) {
        b((o) getAdapter().getItem(i7));
    }
}
