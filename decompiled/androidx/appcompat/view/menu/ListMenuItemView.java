package androidx.appcompat.view.menu;

import a2.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import i.a;
import o.m;
import o.o;
import o.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f629j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f635q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVarP = b.P(getContext(), attributeSet, a.f6560r, R.attr.listMenuViewStyle);
        this.f629j = bVarP.D(5);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        this.k = typedArray.getResourceId(1, -1);
        this.f631m = typedArray.getBoolean(7, false);
        this.f630l = context;
        this.f632n = bVarP.D(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f633o = typedArrayObtainStyledAttributes.hasValue(0);
        bVarP.V();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f634p == null) {
            this.f634p = LayoutInflater.from(getContext());
        }
        return this.f634p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f626g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    @Override // o.z
    public final void a(o oVar) {
        boolean z10;
        int i7;
        String string;
        boolean z11;
        this.f620a = oVar;
        boolean zIsVisible = oVar.isVisible();
        m mVar = oVar.f9214n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(oVar.f9206e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f9211j : oVar.f9209h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        mVar.n();
        if (z10) {
            o oVar2 = this.f620a;
            m mVar2 = oVar2.f9214n;
            if (mVar2.o()) {
                if ((mVar2.n() ? oVar2.f9211j : oVar2.f9209h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i7 = z11 ? 0 : 8;
        }
        if (i7 == 0) {
            TextView textView = this.f625f;
            o oVar3 = this.f620a;
            m mVar3 = oVar3.f9214n;
            Context context = mVar3.f9176a;
            char c10 = mVar3.n() ? oVar3.f9211j : oVar3.f9209h;
            if (c10 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i10 = mVar3.n() ? oVar3.k : oVar3.f9210i;
                o.c(sb2, i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                o.c(sb2, i10, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                o.c(sb2, i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                o.c(sb2, i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                o.c(sb2, i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                o.c(sb2, i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c10 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f625f.getVisibility() != i7) {
            this.f625f.setVisibility(i7);
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f9217q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f627h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f627h.getLayoutParams();
        rect.top = this.f627h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.z
    public o getItemData() {
        return this.f620a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f629j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f623d = textView;
        int i7 = this.k;
        if (i7 != -1) {
            textView.setTextAppearance(this.f630l, i7);
        }
        this.f625f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f626g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f632n);
        }
        this.f627h = (ImageView) findViewById(R.id.group_divider);
        this.f628i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f621b != null && this.f631m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f621b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f622c == null && this.f624e == null) {
            return;
        }
        if ((this.f620a.f9224x & 4) != 0) {
            if (this.f622c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f622c = radioButton;
                LinearLayout linearLayout = this.f628i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f622c;
            view = this.f624e;
        } else {
            if (this.f624e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f624e = checkBox;
                LinearLayout linearLayout2 = this.f628i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f624e;
            view = this.f622c;
        }
        if (z10) {
            compoundButton.setChecked(this.f620a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f624e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f622c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f620a.f9224x & 4) != 0) {
            if (this.f622c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f622c = radioButton;
                LinearLayout linearLayout = this.f628i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f622c;
        } else {
            if (this.f624e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f624e = checkBox;
                LinearLayout linearLayout2 = this.f628i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f624e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f635q = z10;
        this.f631m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f627h;
        if (imageView != null) {
            imageView.setVisibility((this.f633o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f620a.f9214n;
        boolean z10 = this.f635q;
        if (z10 || this.f631m) {
            ImageView imageView = this.f621b;
            if (imageView == null && drawable == null && !this.f631m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f621b = imageView2;
                LinearLayout linearLayout = this.f628i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f631m) {
                this.f621b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f621b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f621b.getVisibility() != 0) {
                this.f621b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f623d.getVisibility() != 8) {
                this.f623d.setVisibility(8);
            }
        } else {
            this.f623d.setText(charSequence);
            if (this.f623d.getVisibility() != 0) {
                this.f623d.setVisibility(0);
            }
        }
    }
}
