package j;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.baidu.carlifevehicle.R;
import e4.l0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c.q implements DialogInterface, k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f6797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f6798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f6799f;

    /* JADX WARN: Type inference failed for: r2v2, types: [j.c0] */
    public h(ContextThemeWrapper contextThemeWrapper, int i7) {
        int i10;
        int iF = f(contextThemeWrapper, i7);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = iF;
        }
        super(contextThemeWrapper, i10);
        this.f6798e = new e4.j() { // from class: j.c0
            @Override // e4.j
            public final boolean c(KeyEvent keyEvent) {
                return this.f6748a.i(keyEvent);
            }
        };
        q qVarC = c();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((b0) qVarC).T = iF;
        qVarC.c();
        this.f6799f = new f(getContext(), this, getWindow());
    }

    public static int f(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // c.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        b0 b0Var = (b0) c();
        b0Var.u();
        ((ViewGroup) b0Var.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        b0Var.f6732m.a(b0Var.f6730l.getCallback());
    }

    public final q c() {
        if (this.f6797d == null) {
            o oVar = q.f6839a;
            this.f6797d = new b0(getContext(), getWindow(), this, this);
        }
        return this.f6797d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o9.e0.t(this.f6798e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        b0 b0Var = (b0) c();
        b0Var.u();
        return b0Var.f6730l.findViewById(i7);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().j(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b0 b0Var = (b0) c();
        if (b0Var.f6734o != null) {
            b0Var.z();
            b0Var.f6734o.getClass();
            b0Var.A(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0294  */
    /* JADX WARN: Code duplicated, block: B:103:0x0298  */
    /* JADX WARN: Code duplicated, block: B:105:0x029e  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02da  */
    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:49:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0209  */
    /* JADX WARN: Code duplicated, block: B:58:0x0210  */
    /* JADX WARN: Code duplicated, block: B:59:0x0212  */
    /* JADX WARN: Code duplicated, block: B:65:0x0223  */
    /* JADX WARN: Code duplicated, block: B:67:0x0227  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0236  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0246  */
    /* JADX WARN: Code duplicated, block: B:79:0x024d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    /* JADX WARN: Code duplicated, block: B:84:0x025a  */
    /* JADX WARN: Code duplicated, block: B:85:0x025f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0267  */
    /* JADX WARN: Code duplicated, block: B:89:0x026c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0273  */
    /* JADX WARN: Code duplicated, block: B:95:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x027e  */
    @Override // c.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i7;
        boolean z10;
        int i10;
        boolean z11;
        View viewFindViewById;
        AlertController$RecycleListView alertController$RecycleListView;
        AlertController$RecycleListView alertController$RecycleListView2;
        ListAdapter listAdapter;
        View view;
        int i11;
        View viewFindViewById2;
        View viewFindViewById3;
        int i12;
        View view2;
        AlertController$RecycleListView alertController$RecycleListView3;
        int paddingTop;
        int paddingBottom;
        NestedScrollView nestedScrollView;
        View viewFindViewById4;
        View viewFindViewById5;
        e(bundle);
        f fVar = this.f6799f;
        fVar.f6772b.setContentView(fVar.f6786q);
        Context context = fVar.f6771a;
        Window window = fVar.f6773c;
        View viewFindViewById6 = window.findViewById(R.id.parentPanel);
        View viewFindViewById7 = viewFindViewById6.findViewById(R.id.topPanel);
        View viewFindViewById8 = viewFindViewById6.findViewById(R.id.contentPanel);
        View viewFindViewById9 = viewFindViewById6.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById10 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById11 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById12 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = f.b(viewFindViewById10, viewFindViewById7);
        ViewGroup viewGroupB2 = f.b(viewFindViewById11, viewFindViewById8);
        ViewGroup viewGroupB3 = f.b(viewFindViewById12, viewFindViewById9);
        NestedScrollView nestedScrollView2 = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.f6779i = nestedScrollView2;
        nestedScrollView2.setFocusable(false);
        fVar.f6779i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        fVar.f6782m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f6779i.removeView(fVar.f6782m);
            if (fVar.f6775e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.f6779i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(fVar.f6779i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(fVar.f6775e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        fVar.f6776f = button;
        a aVar = fVar.f6792w;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            fVar.f6776f.setVisibility(8);
            i7 = 0;
        } else {
            fVar.f6776f.setText((CharSequence) null);
            fVar.f6776f.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        fVar.f6777g = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            fVar.f6777g.setVisibility(8);
        } else {
            fVar.f6777g.setText((CharSequence) null);
            fVar.f6777g.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        fVar.f6778h = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            fVar.f6778h.setVisibility(8);
        } else {
            fVar.f6778h.setText((CharSequence) null);
            fVar.f6778h.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i7 == 1) {
                Button button4 = fVar.f6776f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i7 == 2) {
                Button button5 = fVar.f6777g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i7 == 4) {
                Button button6 = fVar.f6778h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i7 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (fVar.f6783n == null) {
            fVar.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(fVar.f6774d) || !fVar.f6790u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                fVar.k.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                fVar.f6781l = textView2;
                textView2.setText(fVar.f6774d);
                Drawable drawable = fVar.f6780j;
                if (drawable != null) {
                    fVar.k.setImageDrawable(drawable);
                } else {
                    fVar.f6781l.setPadding(fVar.k.getPaddingLeft(), fVar.k.getPaddingTop(), fVar.k.getPaddingRight(), fVar.k.getPaddingBottom());
                    fVar.k.setVisibility(8);
                }
            }
            if (viewGroup.getVisibility() != 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (viewGroupB != null || viewGroupB.getVisibility() == 8) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (viewGroupB3.getVisibility() != 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && (viewFindViewById5 = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
                viewFindViewById5.setVisibility(0);
            }
            if (i10 != 0) {
                nestedScrollView = fVar.f6779i;
                if (nestedScrollView != null) {
                    nestedScrollView.setClipToPadding(true);
                }
                if (fVar.f6775e != null) {
                    viewFindViewById4 = viewGroupB.findViewById(R.id.titleDividerNoCustom);
                } else {
                    viewFindViewById4 = null;
                }
                if (viewFindViewById4 != null) {
                    viewFindViewById4.setVisibility(0);
                }
            } else {
                viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
            }
            alertController$RecycleListView = fVar.f6775e;
            if (alertController$RecycleListView != null) {
                alertController$RecycleListView.getClass();
                if (z11 || i10 == 0) {
                    int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                    if (i10 != 0) {
                        paddingTop = alertController$RecycleListView.getPaddingTop();
                    } else {
                        paddingTop = alertController$RecycleListView.f606a;
                    }
                    int paddingRight = alertController$RecycleListView.getPaddingRight();
                    if (z11) {
                        paddingBottom = alertController$RecycleListView.getPaddingBottom();
                    } else {
                        paddingBottom = alertController$RecycleListView.f607b;
                    }
                    alertController$RecycleListView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                }
            }
            if (!z10) {
                view = fVar.f6775e;
                if (view == null) {
                    view = fVar.f6779i;
                }
                if (view != null) {
                    i11 = i10 | (z11 ? 2 : 0);
                    viewFindViewById2 = window.findViewById(R.id.scrollIndicatorUp);
                    viewFindViewById3 = window.findViewById(R.id.scrollIndicatorDown);
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 23) {
                        WeakHashMap weakHashMap = l0.f4369a;
                        if (i12 >= 23) {
                            e4.f0.b(view, i11, 3);
                        }
                        if (viewFindViewById2 != null) {
                            viewGroupB2.removeView(viewFindViewById2);
                        }
                        if (viewFindViewById3 != null) {
                            viewGroupB2.removeView(viewFindViewById3);
                        }
                    } else {
                        if (viewFindViewById2 != null && (i11 & 1) == 0) {
                            viewGroupB2.removeView(viewFindViewById2);
                            viewFindViewById2 = null;
                        }
                        if (viewFindViewById3 == null && (i11 & 2) == 0) {
                            viewGroupB2.removeView(viewFindViewById3);
                            view2 = null;
                        } else {
                            view2 = viewFindViewById3;
                        }
                        if (viewFindViewById2 == null || view2 != null) {
                            alertController$RecycleListView3 = fVar.f6775e;
                            if (alertController$RecycleListView3 != null) {
                                alertController$RecycleListView3.setOnScrollListener(new b(viewFindViewById2, view2));
                                fVar.f6775e.post(new b4.q(fVar, viewFindViewById2, view2));
                            } else {
                                if (viewFindViewById2 != null) {
                                    viewGroupB2.removeView(viewFindViewById2);
                                }
                                if (view2 != null) {
                                    viewGroupB2.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
            alertController$RecycleListView2 = fVar.f6775e;
            if (alertController$RecycleListView2 != null || (listAdapter = fVar.f6784o) == null) {
            }
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i13 = fVar.f6785p;
            if (i13 > -1) {
                alertController$RecycleListView2.setItemChecked(i13, true);
                alertController$RecycleListView2.setSelection(i13);
                return;
            }
            return;
        }
        viewGroupB.addView(fVar.f6783n, 0, new ViewGroup.LayoutParams(-1, -2));
        window.findViewById(R.id.title_template).setVisibility(8);
        if (viewGroup.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (viewGroupB != null) {
            i10 = 0;
        } else {
            i10 = 0;
        }
        if (viewGroupB3.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            viewFindViewById5.setVisibility(0);
        }
        if (i10 != 0) {
            nestedScrollView = fVar.f6779i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (fVar.f6775e != null) {
                viewFindViewById4 = viewGroupB.findViewById(R.id.titleDividerNoCustom);
            } else {
                viewFindViewById4 = null;
            }
            if (viewFindViewById4 != null) {
                viewFindViewById4.setVisibility(0);
            }
        } else {
            viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
        alertController$RecycleListView = fVar.f6775e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (z11) {
                int paddingLeft2 = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    paddingTop = alertController$RecycleListView.getPaddingTop();
                } else {
                    paddingTop = alertController$RecycleListView.f606a;
                }
                int paddingRight2 = alertController$RecycleListView.getPaddingRight();
                if (z11) {
                    paddingBottom = alertController$RecycleListView.getPaddingBottom();
                } else {
                    paddingBottom = alertController$RecycleListView.f607b;
                }
                alertController$RecycleListView.setPadding(paddingLeft2, paddingTop, paddingRight2, paddingBottom);
            } else {
                int paddingLeft3 = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    paddingTop = alertController$RecycleListView.getPaddingTop();
                } else {
                    paddingTop = alertController$RecycleListView.f606a;
                }
                int paddingRight3 = alertController$RecycleListView.getPaddingRight();
                if (z11) {
                    paddingBottom = alertController$RecycleListView.getPaddingBottom();
                } else {
                    paddingBottom = alertController$RecycleListView.f607b;
                }
                alertController$RecycleListView.setPadding(paddingLeft3, paddingTop, paddingRight3, paddingBottom);
            }
        }
        if (!z10) {
            view = fVar.f6775e;
            if (view == null) {
                view = fVar.f6779i;
            }
            if (view != null) {
                i11 = i10 | (z11 ? 2 : 0);
                viewFindViewById2 = window.findViewById(R.id.scrollIndicatorUp);
                viewFindViewById3 = window.findViewById(R.id.scrollIndicatorDown);
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23) {
                    WeakHashMap weakHashMap2 = l0.f4369a;
                    if (i12 >= 23) {
                        e4.f0.b(view, i11, 3);
                    }
                    if (viewFindViewById2 != null) {
                        viewGroupB2.removeView(viewFindViewById2);
                    }
                    if (viewFindViewById3 != null) {
                        viewGroupB2.removeView(viewFindViewById3);
                    }
                } else {
                    if (viewFindViewById2 != null) {
                        viewGroupB2.removeView(viewFindViewById2);
                        viewFindViewById2 = null;
                    }
                    if (viewFindViewById3 == null) {
                        view2 = viewFindViewById3;
                    } else {
                        view2 = viewFindViewById3;
                    }
                    if (viewFindViewById2 == null) {
                        alertController$RecycleListView3 = fVar.f6775e;
                        if (alertController$RecycleListView3 != null) {
                            alertController$RecycleListView3.setOnScrollListener(new b(viewFindViewById2, view2));
                            fVar.f6775e.post(new b4.q(fVar, viewFindViewById2, view2));
                        } else {
                            if (viewFindViewById2 != null) {
                                viewGroupB2.removeView(viewFindViewById2);
                            }
                            if (view2 != null) {
                                viewGroupB2.removeView(view2);
                            }
                        }
                    } else {
                        alertController$RecycleListView3 = fVar.f6775e;
                        if (alertController$RecycleListView3 != null) {
                            alertController$RecycleListView3.setOnScrollListener(new b(viewFindViewById2, view2));
                            fVar.f6775e.post(new b4.q(fVar, viewFindViewById2, view2));
                        } else {
                            if (viewFindViewById2 != null) {
                                viewGroupB2.removeView(viewFindViewById2);
                            }
                            if (view2 != null) {
                                viewGroupB2.removeView(view2);
                            }
                        }
                    }
                }
            }
        }
        alertController$RecycleListView2 = fVar.f6775e;
        if (alertController$RecycleListView2 != null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6799f.f6779i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6799f.f6779i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // c.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        b0 b0Var = (b0) c();
        b0Var.z();
        k0 k0Var = b0Var.f6734o;
        if (k0Var != null) {
            k0Var.f6831y = false;
            n.j jVar = k0Var.f6830x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // c.q, android.app.Dialog
    public final void setContentView(int i7) {
        b();
        c().g(i7);
    }

    @Override // c.q, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().h(view);
    }

    @Override // c.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().i(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        c().j(getContext().getString(i7));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        f fVar = this.f6799f;
        fVar.f6774d = charSequence;
        TextView textView = fVar.f6781l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
