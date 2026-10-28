package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.baidu.carlifevehicle.R;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements jb.a, jb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9920f;

    public t() {
        this.f9915a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f9916b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f9917c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f9918d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f9919e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f9920f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public t(aa.h0 h0Var, da.a aVar, mb.k kVar, ca.b bVar) {
        this.f9915a = bVar;
        this.f9916b = kVar.b(new aa.a(26, this));
        this.f9917c = h0Var;
        this.f9918d = aVar;
        this.f9919e = new u0.k(h0Var, aVar);
        this.f9920f = ta.e.f12885g;
    }

    public static final bb.g g(t tVar, wa.e eVar, Object obj) {
        bb.g gVarB = bb.h.b((aa.h0) tVar.f9917c, obj);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + eVar;
        i9.l.e(str, "message");
        return new bb.j(str);
    }

    public static boolean j(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList l(Context context, int i7) {
        int iC = s2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{s2.f9909b, s2.f9911d, s2.f9910c, s2.f9913f}, new int[]{s2.b(context, R.attr.colorButtonNormal), x3.a.b(iC, i7), x3.a.b(iC, i7), i7});
    }

    public static /* synthetic */ List p(t tVar, jb.w wVar, pa.p pVar, Boolean bool, boolean z10, int i7) {
        boolean z11 = (i7 & 4) == 0;
        if ((i7 & 16) != 0) {
            bool = null;
        }
        return tVar.o(wVar, pVar, z11, false, bool, (i7 & 32) != 0 ? false : z10);
    }

    public static pa.p q(xa.a aVar, ta.f fVar, aa.f0 f0Var, int i7, boolean z10) throws IOException {
        i9.l.e(aVar, "proto");
        i9.l.e(fVar, "nameResolver");
        a2.f.M(i7, "kind");
        if (aVar instanceof ra.n) {
            xa.g gVar = va.g.f13718a;
            va.e eVarA = va.g.a((ra.n) aVar, fVar, f0Var);
            if (eVarA != null) {
                return n4.h.D(eVarA);
            }
        } else if (aVar instanceof ra.a0) {
            xa.g gVar2 = va.g.f13718a;
            va.e eVarC = va.g.c((ra.a0) aVar, fVar, f0Var);
            if (eVarC != null) {
                return n4.h.D(eVarC);
            }
        } else if (aVar instanceof ra.i0) {
            xa.m mVar = ua.k.f13303d;
            i9.l.d(mVar, "propertySignature");
            ua.e eVar = (ua.e) n3.n.n0((xa.k) aVar, mVar);
            if (eVar != null) {
                int iB = e1.d.b(i7);
                if (iB == 1) {
                    return n3.n.v0((ra.i0) aVar, fVar, f0Var, true, true, z10);
                }
                if (iB == 2) {
                    if ((eVar.f13256b & 4) != 4) {
                        return null;
                    }
                    ua.c cVar = eVar.f13259e;
                    i9.l.d(cVar, "getGetter(...)");
                    return new pa.p(fVar.getString(cVar.f13244c).concat(fVar.getString(cVar.f13245d)));
                }
                if (iB != 3 || (eVar.f13256b & 8) != 8) {
                    return null;
                }
                ua.c cVar2 = eVar.f13260f;
                i9.l.d(cVar2, "getSetter(...)");
                return new pa.p(fVar.getString(cVar2.f13244c).concat(fVar.getString(cVar2.f13245d)));
            }
        }
        return null;
    }

    public static LayerDrawable r(n2 n2Var, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable drawableF = n2Var.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = n2Var.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void y(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = u.f9926b;
        }
        PorterDuff.Mode mode2 = u.f9926b;
        synchronized (u.class) {
            porterDuffColorFilterH = n2.h(i7, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    @Override // jb.c
    public ArrayList a(ra.s0 s0Var, ta.f fVar) {
        i9.l.e(s0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        Object objI = s0Var.i(ua.k.f13305f);
        i9.l.d(objI, "getExtension(...)");
        Iterable<ra.h> iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        for (ra.h hVar : iterable) {
            i9.l.b(hVar);
            arrayList.add(((u0.k) this.f9919e).C0(hVar, fVar));
        }
        return arrayList;
    }

    @Override // jb.c
    public List b(jb.w wVar, ra.i0 i0Var) {
        i9.l.e(i0Var, "proto");
        return x(wVar, i0Var, pa.b.f10324c);
    }

    @Override // jb.a
    public Object c(jb.w wVar, ra.i0 i0Var, nb.w wVar2) {
        i9.l.e(i0Var, "proto");
        return w(wVar, i0Var, 3, wVar2, pa.a.f10319b);
    }

    @Override // jb.c
    public List d(jb.w wVar, ra.i0 i0Var) {
        i9.l.e(i0Var, "proto");
        return x(wVar, i0Var, pa.b.f10323b);
    }

    @Override // jb.c
    public List e(jb.w wVar, xa.a aVar, int i7) throws IOException {
        i9.l.e(aVar, "proto");
        a2.f.M(i7, "kind");
        pa.p pVarQ = q(aVar, wVar.f7084a, wVar.f7085b, i7, false);
        return pVarQ != null ? p(this, wVar, new pa.p(ob.a.s(new StringBuilder(), pVarQ.f10353a, "@0")), null, false, 60) : u8.w.f13122a;
    }

    @Override // jb.c
    public ArrayList f(ra.x0 x0Var, ta.f fVar) {
        i9.l.e(x0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        Object objI = x0Var.i(ua.k.f13307h);
        i9.l.d(objI, "getExtension(...)");
        Iterable<ra.h> iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        for (ra.h hVar : iterable) {
            i9.l.b(hVar);
            arrayList.add(((u0.k) this.f9919e).C0(hVar, fVar));
        }
        return arrayList;
    }

    @Override // jb.c
    public List h(jb.w wVar, ra.v vVar) {
        i9.l.e(wVar, "container");
        String string = wVar.f7084a.getString(vVar.f12226d);
        String strB = va.b.b(((jb.u) wVar).f7080f.b());
        i9.l.e(strB, "desc");
        return p(this, wVar, new pa.p(string + '#' + strB), null, false, 60);
    }

    @Override // jb.a
    public Object i(jb.w wVar, ra.i0 i0Var, nb.w wVar2) {
        i9.l.e(i0Var, "proto");
        return w(wVar, i0Var, 2, wVar2, pa.a.f10320c);
    }

    @Override // jb.c
    public ArrayList k(jb.u uVar) throws InvocationTargetException {
        i9.l.e(uVar, "container");
        x9.n0 n0Var = uVar.f7086c;
        pa.o oVar = n0Var instanceof pa.o ? (pa.o) n0Var : null;
        ca.c cVar = oVar != null ? oVar.f10352a : null;
        if (cVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + uVar.f7080f.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = cVar.f2576a;
        i9.l.e(cls, "klass");
        i9.b bVarH = i9.l.h(cls.getDeclaredAnnotations());
        while (bVarH.hasNext()) {
            Annotation annotation = (Annotation) bVarH.next();
            i9.l.b(annotation);
            Class clsL = g5.a.L(g5.a.G(annotation));
            i3 i3VarV = v(da.d.a(clsL), new ca.a(annotation), arrayList);
            if (i3VarV != null) {
                k9.a.J(i3VarV, annotation, clsL);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // jb.c
    public List m(jb.w wVar, xa.a aVar, int i7, int i10, ra.a1 a1Var) throws IOException {
        i9.l.e(aVar, "callableProto");
        a2.f.M(i7, "kind");
        int i11 = 0;
        pa.p pVarQ = q(aVar, wVar.f7084a, wVar.f7085b, i7, false);
        if (pVarQ == null) {
            return u8.w.f13122a;
        }
        if (aVar instanceof ra.a0) {
            int i12 = ((ra.a0) aVar).f11804c;
            if ((i12 & 32) == 32 || (i12 & 64) == 64) {
                i11 = 1;
            }
        } else if (aVar instanceof ra.i0) {
            int i13 = ((ra.i0) aVar).f12008c;
            if ((i13 & 32) == 32 || (i13 & 64) == 64) {
                i11 = 1;
            }
        } else {
            if (!(aVar instanceof ra.n)) {
                throw new UnsupportedOperationException("Unsupported message: " + aVar.getClass());
            }
            jb.u uVar = (jb.u) wVar;
            if (uVar.f7081g == ra.j.ENUM_CLASS) {
                i11 = 2;
            } else if (uVar.f7082h) {
                i11 = 1;
            }
        }
        return p(this, wVar, new pa.p(pVarQ.f10353a + '@' + (i10 + i11)), null, false, 60);
    }

    @Override // jb.c
    public List n(jb.w wVar, xa.a aVar, int i7) throws IOException {
        i9.l.e(aVar, "proto");
        a2.f.M(i7, "kind");
        if (i7 == 2) {
            return x(wVar, (ra.i0) aVar, pa.b.f10322a);
        }
        pa.p pVarQ = q(aVar, wVar.f7084a, wVar.f7085b, i7, false);
        return pVarQ == null ? u8.w.f13122a : p(this, wVar, pVarQ, null, false, 60);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public List o(jb.w wVar, pa.p pVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List list;
        ca.c cVarC = n3.l.C(wVar, z10, z11, bool, z12, (ca.b) this.f9915a, (ta.e) this.f9920f);
        if (cVarC == null) {
            if (wVar instanceof jb.u) {
                x9.n0 n0Var = ((jb.u) wVar).f7086c;
                pa.o oVar = n0Var instanceof pa.o ? (pa.o) n0Var : null;
                if (oVar != null) {
                    cVarC = oVar.f10352a;
                } else {
                    cVarC = null;
                }
            } else {
                cVarC = null;
            }
        }
        return (cVarC == null || (list = (List) ((pa.c) ((mb.e) this.f9916b).invoke(cVarC)).f10326a.get(pVar)) == null) ? u8.w.f13122a : list;
    }

    public ColorStateList s(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return o9.e0.x(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return o9.e0.x(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return l(context, s2.c(context, R.attr.colorButtonNormal));
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return l(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return l(context, s2.c(context, R.attr.colorAccent));
            }
            if (i7 == R.drawable.abc_spinner_mtrl_am_alpha || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return o9.e0.x(context, R.color.abc_tint_spinner);
            }
            if (j((int[]) this.f9916b, i7)) {
                return s2.d(context, R.attr.colorControlNormal);
            }
            if (j((int[]) this.f9919e, i7)) {
                return o9.e0.x(context, R.color.abc_tint_default);
            }
            if (j((int[]) this.f9920f, i7)) {
                return o9.e0.x(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return o9.e0.x(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = s2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = s2.f9909b;
            iArr2[0] = s2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = s2.f9912e;
            iArr2[1] = s2.c(context, R.attr.colorControlActivated);
            iArr[2] = s2.f9913f;
            iArr2[2] = s2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = s2.f9909b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = s2.f9912e;
            iArr2[1] = s2.c(context, R.attr.colorControlActivated);
            iArr[2] = s2.f9913f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean t(wa.b bVar) {
        ca.c cVarY;
        if (bVar.e() != null && i9.l.a(bVar.f().b(), "Container") && (cVarY = n3.u.y((ca.b) this.f9915a, bVar, (ta.e) this.f9920f)) != null) {
            LinkedHashSet linkedHashSet = t9.a.f12852a;
            Class cls = cVarY.f2576a;
            i9.l.e(cls, "klass");
            i9.b bVarH = i9.l.h(cls.getDeclaredAnnotations());
            boolean z10 = false;
            while (bVarH.hasNext()) {
                Annotation annotation = (Annotation) bVarH.next();
                i9.l.b(annotation);
                if (da.d.a(g5.a.L(g5.a.G(annotation))).equals(ga.x.f6125b)) {
                    z10 = true;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public i3 u(wa.b bVar, x9.n0 n0Var, List list) {
        i9.l.e(list, "result");
        return new i3(this, x9.v.f((aa.h0) this.f9917c, bVar, (da.a) this.f9918d), bVar, list, n0Var);
    }

    public i3 v(wa.b bVar, ca.a aVar, List list) {
        i9.l.e(list, "result");
        if (t9.a.f12852a.contains(bVar)) {
            return null;
        }
        return u(bVar, aVar, list);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public Object w(jb.w wVar, ra.i0 i0Var, int i7, nb.w wVar2, h9.n nVar) throws IOException {
        Object objInvoke;
        ca.c cVarC = n3.l.C(wVar, true, true, ta.d.B.i(i0Var.f12009d), va.g.d(i0Var), (ca.b) this.f9915a, (ta.e) this.f9920f);
        if (cVarC == null) {
            if (wVar instanceof jb.u) {
                x9.n0 n0Var = ((jb.u) wVar).f7086c;
                pa.o oVar = n0Var instanceof pa.o ? (pa.o) n0Var : null;
                if (oVar != null) {
                    cVarC = oVar.f10352a;
                } else {
                    cVarC = null;
                }
            } else {
                cVarC = null;
            }
        }
        if (cVarC != null) {
            ta.e eVar = cVarC.f2577b.f11000b;
            ta.e eVar2 = pa.e.f10333e;
            i9.l.e(eVar2, "version");
            pa.p pVarQ = q(i0Var, wVar.f7084a, wVar.f7085b, i7, eVar.a(eVar2.f12855b, eVar2.f12856c, eVar2.f12857d));
            if (pVarQ != null && (objInvoke = nVar.invoke(((mb.e) this.f9916b).invoke(cVarC), pVarQ)) != null) {
                if (u9.s.a(wVar2)) {
                    objInvoke = (bb.g) objInvoke;
                    if (objInvoke instanceof bb.d) {
                        return new bb.y(((Number) ((bb.d) objInvoke).f1683a).byteValue());
                    }
                    if (objInvoke instanceof bb.v) {
                        return new bb.y(((Number) ((bb.v) objInvoke).f1683a).shortValue());
                    }
                    if (objInvoke instanceof bb.k) {
                        return new bb.y(((Number) ((bb.k) objInvoke).f1683a).intValue());
                    }
                    if (objInvoke instanceof bb.t) {
                        return new bb.y(((Number) ((bb.t) objInvoke).f1683a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List x(jb.w wVar, ra.i0 i0Var, pa.b bVar) {
        aa.f0 f0Var = wVar.f7085b;
        ta.f fVar = wVar.f7084a;
        Boolean boolI = ta.d.B.i(i0Var.f12009d);
        boolean zD = va.g.d(i0Var);
        if (bVar == pa.b.f10322a) {
            pa.p pVarV0 = n3.n.v0(i0Var, fVar, f0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (pVarV0 != null) {
                return p(this, wVar, pVarV0, boolI, zD, 8);
            }
        } else {
            pa.p pVarV1 = n3.n.v0(i0Var, fVar, f0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (pVarV1 != null) {
                if (zb.j.r0(pVarV1.f10353a, "$delegate", false) == (bVar == pa.b.f10324c)) {
                    return o(wVar, pVarV1, true, true, boolI, zD);
                }
            }
        }
        return u8.w.f13122a;
    }
}
