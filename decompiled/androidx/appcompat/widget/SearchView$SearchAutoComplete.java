package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.tencent.bugly.proguard.c0;
import p.o;
import p.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f714g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f714g = new c0(5, this);
        this.f712e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i7 < 600) {
            return (i7 < 640 || i10 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f712e <= 0 || super.enoughToFilter();
    }

    @Override // p.o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f713f) {
            c0 c0Var = this.f714g;
            removeCallbacks(c0Var);
            post(c0Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        super.onFocusChanged(z10, i7, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        c0 c0Var = this.f714g;
        if (!z10) {
            this.f713f = false;
            removeCallbacks(c0Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f713f = true;
                return;
            }
            this.f713f = false;
            removeCallbacks(c0Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(r2 r2Var) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i7) {
        super.setThreshold(i7);
        this.f712e = i7;
    }
}
