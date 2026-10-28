package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import o.p;
import o9.e0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.m1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f8684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f8685f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f8687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8689d;

    static {
        Class[] clsArr = {Context.class};
        f8684e = clsArr;
        f8685f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f8688c = context;
        Object[] objArr = {context};
        this.f8686a = objArr;
        this.f8687b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i7;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i7 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i7) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z11 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f8660b = 0;
                            gVar.f8661c = 0;
                            gVar.f8662d = 0;
                            gVar.f8663e = 0;
                            gVar.f8664f = true;
                            gVar.f8665g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f8666h) {
                                p pVar = gVar.f8683z;
                                if (pVar == null || !pVar.f9228b.hasSubMenu()) {
                                    gVar.f8666h = true;
                                    gVar.b(gVar.f8659a.add(gVar.f8660b, gVar.f8667i, gVar.f8668j, gVar.k));
                                } else {
                                    gVar.f8666h = true;
                                    gVar.b(gVar.f8659a.addSubMenu(gVar.f8660b, gVar.f8667i, gVar.f8668j, gVar.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
            } else if (z11) {
                xmlPullParser2 = xmlPullParser;
            } else {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.f8688c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f6558p);
                    gVar.f8660b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    gVar.f8661c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    gVar.f8662d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    gVar.f8663e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    gVar.f8664f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    gVar.f8665g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f6559q);
                    gVar.f8667i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    gVar.f8668j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f8661c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.f8662d) & 65535);
                    gVar.k = typedArrayObtainStyledAttributes2.getText(7);
                    gVar.f8669l = typedArrayObtainStyledAttributes2.getText(8);
                    gVar.f8670m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    gVar.f8671n = string == null ? (char) 0 : string.charAt(0);
                    gVar.f8672o = typedArrayObtainStyledAttributes2.getInt(16, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    gVar.f8673p = string2 == null ? (char) 0 : string2.charAt(0);
                    gVar.f8674q = typedArrayObtainStyledAttributes2.getInt(20, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        gVar.f8675r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        gVar.f8675r = gVar.f8663e;
                    }
                    gVar.f8676s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    gVar.f8677t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f8664f);
                    gVar.f8678u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f8665g);
                    gVar.f8679v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    gVar.f8682y = typedArrayObtainStyledAttributes2.getString(12);
                    gVar.f8680w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    gVar.f8681x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z12 = string3 != null;
                    if (z12 && gVar.f8680w == 0 && gVar.f8681x == null) {
                        gVar.f8683z = (p) gVar.a(string3, f8685f, this.f8687b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        gVar.f8683z = null;
                    }
                    gVar.A = typedArrayObtainStyledAttributes2.getText(17);
                    gVar.B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        gVar.D = m1.b(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.D);
                    } else {
                        gVar.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = e0.x(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        gVar.C = colorStateList;
                    } else {
                        gVar.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    gVar.f8666h = false;
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("menu")) {
                    gVar.f8666h = true;
                    SubMenu subMenuAddSubMenu = gVar.f8659a.addSubMenu(gVar.f8660b, gVar.f8667i, gVar.f8668j, gVar.k);
                    gVar.b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser2.next();
            i7 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof o.m)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f8688c.getResources().getLayout(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o.m) {
                    o.m mVar = (o.m) menu;
                    if (!mVar.f9190p) {
                        mVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((o.m) menu).v();
                }
                layout.close();
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z10) {
                ((o.m) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
