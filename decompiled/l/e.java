package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import f5.q;
import org.xmlpull.v1.XmlPullParserException;
import p.n2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements y3.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f7569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f7571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a.a f7572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7575t;

    public e(b bVar, Resources resources) {
        this.f7581e = 255;
        this.f7583g = -1;
        this.f7573r = -1;
        this.f7574s = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayG = w3.b.g(resources2, theme, attributeSet, m.b.f8389a);
        int i7 = 1;
        eVar.setVisible(typedArrayG.getBoolean(1, true), true);
        b bVar = eVar.f7571p;
        bVar.f7542d |= m.a.b(typedArrayG);
        int i10 = 2;
        bVar.f7547i = typedArrayG.getBoolean(2, bVar.f7547i);
        int i11 = 3;
        bVar.f7549l = typedArrayG.getBoolean(3, bVar.f7549l);
        bVar.f7562y = typedArrayG.getInt(4, bVar.f7562y);
        bVar.f7563z = typedArrayG.getInt(5, bVar.f7563z);
        boolean z10 = false;
        eVar.setDither(typedArrayG.getBoolean(0, bVar.f7560w));
        b bVar2 = eVar.f7577a;
        if (resources2 != null) {
            bVar2.f7540b = resources2;
            int i12 = resources2.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar2.f7541c;
            bVar2.f7541c = i12;
            if (i13 != i12) {
                bVar2.f7550m = false;
                bVar2.f7548j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayG.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i7 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                break;
            }
            if (next3 == i10 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayG2 = w3.b.g(resources2, theme, attributeSet, m.b.f8390b);
                    int resourceId = typedArrayG2.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                    int resourceId2 = typedArrayG2.getResourceId(i7, -1);
                    Drawable drawableF = resourceId2 > 0 ? n2.d().f(context2, resourceId2) : null;
                    typedArrayG2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i14 = 0;
                    for (int i15 = 0; i15 < attributeCount; i15++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i16 = i14 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i15, z10)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i14] = attributeNameResource;
                            i14 = i16;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i14);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new q();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableF = m.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f7571p;
                    int iA = bVar3.a(drawableF);
                    bVar3.H[iA] = iArrTrimStateSet;
                    bVar3.J.e(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayG3 = w3.b.g(resources2, theme, attributeSet, m.b.f8391c);
                        int resourceId3 = typedArrayG3.getResourceId(2, -1);
                        int resourceId4 = typedArrayG3.getResourceId(1, -1);
                        int resourceId5 = typedArrayG3.getResourceId(z10 ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? n2.d().f(context2, resourceId5) : null;
                        boolean z11 = typedArrayG3.getBoolean(3, z10);
                        typedArrayG3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new f5.e(context2);
                                drawableF2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableF2 = m.a.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.f7571p;
                        int iA2 = bVar4.a(drawableF2);
                        long j5 = resourceId3;
                        long j10 = resourceId4;
                        long j11 = (j5 << 32) | j10;
                        long j12 = z11 ? 8589934592L : 0L;
                        long j13 = iA2;
                        bVar4.I.a(j11, Long.valueOf(j13 | j12));
                        if (z11) {
                            bVar4.I.a((j10 << 32) | j5, Long.valueOf(j13 | 4294967296L | j12));
                        }
                        context2 = context;
                        resources2 = resources;
                        i7 = 1;
                        z10 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i10 = 2;
                    i11 = 3;
                }
                i7 = 1;
                i10 = 2;
                i11 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    @Override // l.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // l.f
    public final void d(b bVar) {
        this.f7577a = bVar;
        int i7 = this.f7583g;
        if (i7 >= 0) {
            Drawable drawableD = bVar.d(i7);
            this.f7579c = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f7580d = null;
        this.f7569n = bVar;
        this.f7571p = bVar;
    }

    public final Drawable f() {
        if (!this.f7570o) {
            super.mutate();
            b bVar = this.f7569n;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f7570o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // l.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        a.a aVar = this.f7572q;
        if (aVar != null) {
            aVar.V();
            this.f7572q = null;
            c(this.f7573r);
            this.f7573r = -1;
            this.f7574s = -1;
        }
    }

    @Override // l.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f7575t) {
            f();
            b bVar = this.f7571p;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f7575t = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iE;
        a.a aVar;
        b bVar = this.f7571p;
        int iF = bVar.f(iArr);
        if (iF < 0) {
            iF = bVar.f(StateSet.WILD_CARD);
        }
        int i7 = this.f7583g;
        boolean z10 = false;
        if (iF != i7) {
            a.a aVar2 = this.f7572q;
            if (aVar2 == null) {
                this.f7572q = null;
                this.f7574s = -1;
                this.f7573r = -1;
                b bVar2 = this.f7571p;
                int iE2 = bVar2.e(i7);
                iE = bVar2.e(iF);
                if (iE == 0 && iE2 != 0) {
                    long j5 = ((long) iE) | (((long) iE2) << 32);
                    int iLongValue = (int) ((Long) bVar2.I.d(j5)).longValue();
                    if (iLongValue >= 0) {
                        boolean z11 = (((Long) bVar2.I.d(j5)).longValue() & 8589934592L) != 0;
                        c(iLongValue);
                        Object obj = this.f7579c;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.d(j5)).longValue() & 4294967296L) != 0, z11);
                        } else if (obj instanceof f5.e) {
                            aVar = new a((f5.e) obj, 1);
                        } else if (obj instanceof Animatable) {
                            aVar = new a((Animatable) obj, 0);
                        } else if (c(iF)) {
                            z10 = true;
                        }
                        aVar.U();
                        this.f7572q = aVar;
                        this.f7574s = i7;
                        this.f7573r = iF;
                        z10 = true;
                    } else if (c(iF)) {
                        z10 = true;
                    }
                } else if (c(iF)) {
                    z10 = true;
                }
            } else {
                if (iF != this.f7573r) {
                    if (iF == this.f7574s && aVar2.m()) {
                        aVar2.R();
                        this.f7573r = this.f7574s;
                        this.f7574s = iF;
                    } else {
                        i7 = this.f7573r;
                        aVar2.V();
                        this.f7572q = null;
                        this.f7574s = -1;
                        this.f7573r = -1;
                        b bVar3 = this.f7571p;
                        int iE3 = bVar3.e(i7);
                        iE = bVar3.e(iF);
                        if (iE == 0) {
                            if (c(iF)) {
                            }
                        } else if (c(iF)) {
                        }
                    }
                }
                z10 = true;
            }
        }
        Drawable drawable = this.f7579c;
        return drawable != null ? drawable.setState(iArr) | z10 : z10;
    }

    @Override // l.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        a.a aVar = this.f7572q;
        if (aVar != null && (visible || z11)) {
            if (z10) {
                aVar.U();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
