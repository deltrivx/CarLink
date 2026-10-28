package p4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10217a;

    public n(u uVar) {
        this.f10217a = uVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        i iVar;
        z zVarF;
        boolean zEquals = m.class.getName().equals(str);
        u uVar = this.f10217a;
        if (zEquals) {
            return new m(context, attributeSet, uVar);
        }
        i iVar2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o4.a.f9456a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = i.class.isAssignableFrom(r.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    i iVarY = resourceId != -1 ? uVar.y(resourceId) : null;
                    if (iVarY == null && string != null) {
                        da.a aVar = uVar.f10230c;
                        ArrayList arrayList = (ArrayList) aVar.f3847b;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                iVar = iVar2;
                                Iterator it = ((HashMap) aVar.f3848c).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        iVarY = iVar;
                                        break;
                                    }
                                    z zVar = (z) it.next();
                                    if (zVar != null) {
                                        iVarY = zVar.f10282c;
                                        if (string.equals(iVarY.f10198x)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                i iVar3 = (i) arrayList.get(size);
                                iVar = iVar2;
                                if (iVar3 != null && string.equals(iVar3.f10198x)) {
                                    iVarY = iVar3;
                                    break;
                                }
                                size--;
                                iVar2 = iVar;
                            }
                        }
                    } else {
                        iVar = null;
                    }
                    if (iVarY == null && id != -1) {
                        iVarY = uVar.y(id);
                    }
                    if (iVarY == null) {
                        r rVarA = uVar.A();
                        context.getClassLoader();
                        iVarY = rVarA.a(attributeValue);
                        iVarY.f10187m = true;
                        iVarY.f10196v = resourceId != 0 ? resourceId : id;
                        iVarY.f10197w = id;
                        iVarY.f10198x = string;
                        iVarY.f10188n = true;
                        iVarY.f10192r = uVar;
                        k kVar = uVar.f10246t;
                        iVarY.f10193s = kVar;
                        j.j jVar = kVar.f10204d;
                        iVarY.D = true;
                        if ((kVar == null ? iVar : kVar.f10203c) != null) {
                            iVarY.D = true;
                        }
                        zVarF = uVar.a(iVarY);
                        if (u.D(2)) {
                            Log.v("FragmentManager", "Fragment " + iVarY + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (iVarY.f10188n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        iVarY.f10188n = true;
                        iVarY.f10192r = uVar;
                        k kVar2 = uVar.f10246t;
                        iVarY.f10193s = kVar2;
                        j.j jVar2 = kVar2.f10204d;
                        iVarY.D = true;
                        if ((kVar2 == null ? iVar : kVar2.f10203c) != null) {
                            iVarY.D = true;
                        }
                        zVarF = uVar.f(iVarY);
                        if (u.D(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + iVarY + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    q4.b bVar = q4.c.f10948a;
                    q4.c.b(new q4.a(iVarY, "Attempting to use <fragment> tag to add fragment " + iVarY + " to container " + viewGroup));
                    q4.c.a(iVarY).getClass();
                    iVarY.E = viewGroup;
                    zVarF.j();
                    zVarF.i();
                    throw new IllegalStateException(a2.f.G("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
