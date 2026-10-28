package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r.a f1071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f1072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f1073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fc.h0 f1078i;

    public v(t tVar, boolean z10) {
        new AtomicReference(null);
        this.f1070a = z10;
        this.f1071b = new r.a();
        o oVar = o.f1057b;
        this.f1072c = oVar;
        this.f1077h = new ArrayList();
        this.f1073d = new WeakReference(tVar);
        this.f1078i = fc.y.b(oVar);
    }

    public final void a(s sVar) {
        r gVar;
        u uVar;
        t tVar;
        n nVar;
        i9.l.e(sVar, "observer");
        c("addObserver");
        o oVar = this.f1072c;
        o oVar2 = o.f1056a;
        if (oVar != oVar2) {
            oVar2 = o.f1057b;
        }
        u uVar2 = new u();
        HashMap map = w.f1079a;
        boolean z10 = sVar instanceof r;
        boolean z11 = sVar instanceof e;
        int i7 = 1;
        if (z10 && z11) {
            gVar = new g((e) sVar, (r) sVar);
        } else if (z11) {
            gVar = new g((e) sVar, (r) null);
        } else if (z10) {
            gVar = (r) sVar;
        } else {
            Class<?> cls = sVar.getClass();
            if (w.b(cls) == 2) {
                Object obj = w.f1080b.get(cls);
                i9.l.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                gVar = new a5.b(i7, iVarArr);
            } else {
                gVar = new g(sVar);
            }
        }
        uVar2.f1069b = gVar;
        uVar2.f1068a = oVar2;
        r.a aVar = this.f1071b;
        r.c cVar = (r.c) aVar.f11060e.get(sVar);
        if (cVar != null) {
            uVar = cVar.f11065b;
        } else {
            HashMap map2 = aVar.f11060e;
            r.c cVar2 = new r.c(sVar, uVar2);
            aVar.f11074d++;
            r.c cVar3 = aVar.f11072b;
            if (cVar3 == null) {
                aVar.f11071a = cVar2;
                aVar.f11072b = cVar2;
            } else {
                cVar3.f11066c = cVar2;
                cVar2.f11067d = cVar3;
                aVar.f11072b = cVar2;
            }
            map2.put(sVar, cVar2);
            uVar = null;
        }
        if (uVar == null && (tVar = (t) this.f1073d.get()) != null) {
            boolean z12 = this.f1074e != 0 || this.f1075f;
            o oVarB = b(sVar);
            this.f1074e++;
            while (uVar2.f1068a.compareTo(oVarB) < 0 && this.f1071b.f11060e.containsKey(sVar)) {
                o oVar3 = uVar2.f1068a;
                ArrayList arrayList = this.f1077h;
                arrayList.add(oVar3);
                l lVar = n.Companion;
                o oVar4 = uVar2.f1068a;
                lVar.getClass();
                i9.l.e(oVar4, "state");
                int iOrdinal = oVar4.ordinal();
                if (iOrdinal == 1) {
                    nVar = n.ON_CREATE;
                } else if (iOrdinal != 2) {
                    nVar = iOrdinal != 3 ? null : n.ON_RESUME;
                } else {
                    nVar = n.ON_START;
                }
                if (nVar == null) {
                    throw new IllegalStateException("no event up from " + uVar2.f1068a);
                }
                uVar2.a(tVar, nVar);
                arrayList.remove(arrayList.size() - 1);
                oVarB = b(sVar);
            }
            if (!z12) {
                h();
            }
            this.f1074e--;
        }
    }

    public final o b(s sVar) {
        HashMap map = this.f1071b.f11060e;
        r.c cVar = map.containsKey(sVar) ? ((r.c) map.get(sVar)).f11067d : null;
        o oVar = cVar != null ? cVar.f11065b.f1068a : null;
        ArrayList arrayList = this.f1077h;
        o oVar2 = arrayList.isEmpty() ? null : (o) arrayList.get(arrayList.size() - 1);
        o oVar3 = this.f1072c;
        i9.l.e(oVar3, "state1");
        if (oVar == null || oVar.compareTo(oVar3) >= 0) {
            oVar = oVar3;
        }
        return (oVar2 == null || oVar2.compareTo(oVar) >= 0) ? oVar : oVar2;
    }

    public final void c(String str) {
        if (this.f1070a) {
            ((q.a) q.a.M().f10527d).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a2.f.G("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(n nVar) {
        i9.l.e(nVar, "event");
        c("handleLifecycleEvent");
        e(nVar.a());
    }

    public final void e(o oVar) {
        if (this.f1072c == oVar) {
            return;
        }
        t tVar = (t) this.f1073d.get();
        o oVar2 = this.f1072c;
        i9.l.e(oVar2, "current");
        o oVar3 = o.f1057b;
        o oVar4 = o.f1056a;
        if (oVar2 == oVar3 && oVar == oVar4) {
            throw new IllegalStateException(("State must be at least '" + o.f1058c + "' to be moved to '" + oVar + "' in component " + tVar).toString());
        }
        if (oVar2 == oVar4 && oVar2 != oVar) {
            throw new IllegalStateException(("State is '" + oVar4 + "' and cannot be moved to `" + oVar + "` in component " + tVar).toString());
        }
        this.f1072c = oVar;
        if (this.f1075f || this.f1074e != 0) {
            this.f1076g = true;
            return;
        }
        this.f1075f = true;
        h();
        this.f1075f = false;
        if (this.f1072c == oVar4) {
            this.f1071b = new r.a();
        }
    }

    public final void f(s sVar) {
        i9.l.e(sVar, "observer");
        c("removeObserver");
        r.a aVar = this.f1071b;
        WeakHashMap weakHashMap = aVar.f11073c;
        HashMap map = aVar.f11060e;
        r.c cVar = (r.c) map.get(sVar);
        if (cVar != null) {
            aVar.f11074d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((r.e) it.next()).a(cVar);
                }
            }
            r.c cVar2 = cVar.f11067d;
            if (cVar2 != null) {
                cVar2.f11066c = cVar.f11066c;
            } else {
                aVar.f11071a = cVar.f11066c;
            }
            r.c cVar3 = cVar.f11066c;
            if (cVar3 != null) {
                cVar3.f11067d = cVar2;
            } else {
                aVar.f11072b = cVar2;
            }
            cVar.f11066c = null;
            cVar.f11067d = null;
        }
        map.remove(sVar);
    }

    public final void g(o oVar) {
        c("setCurrentState");
        e(oVar);
    }

    public final void h() {
        n nVar;
        n nVar2;
        t tVar = (t) this.f1073d.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            r.a aVar = this.f1071b;
            if (aVar.f11074d != 0) {
                r.c cVar = aVar.f11071a;
                i9.l.b(cVar);
                o oVar = cVar.f11065b.f1068a;
                r.c cVar2 = this.f1071b.f11072b;
                i9.l.b(cVar2);
                o oVar2 = cVar2.f11065b.f1068a;
                if (oVar == oVar2 && this.f1072c == oVar2) {
                    break;
                }
                this.f1076g = false;
                o oVar3 = this.f1072c;
                r.c cVar3 = this.f1071b.f11071a;
                i9.l.b(cVar3);
                int iCompareTo = oVar3.compareTo(cVar3.f11065b.f1068a);
                ArrayList arrayList = this.f1077h;
                if (iCompareTo < 0) {
                    r.a aVar2 = this.f1071b;
                    r.b bVar = new r.b(aVar2.f11072b, aVar2.f11071a, 1);
                    aVar2.f11073c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1076g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        i9.l.b(entry);
                        s sVar = (s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f1068a.compareTo(this.f1072c) > 0 && !this.f1076g && this.f1071b.f11060e.containsKey(sVar)) {
                            l lVar = n.Companion;
                            o oVar4 = uVar.f1068a;
                            lVar.getClass();
                            i9.l.e(oVar4, "state");
                            int iOrdinal = oVar4.ordinal();
                            if (iOrdinal == 2) {
                                nVar2 = n.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                nVar2 = iOrdinal != 4 ? null : n.ON_PAUSE;
                            } else {
                                nVar2 = n.ON_STOP;
                            }
                            if (nVar2 == null) {
                                throw new IllegalStateException("no event down from " + uVar.f1068a);
                            }
                            arrayList.add(nVar2.a());
                            uVar.a(tVar, nVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                r.c cVar4 = this.f1071b.f11072b;
                if (!this.f1076g && cVar4 != null && this.f1072c.compareTo(cVar4.f11065b.f1068a) > 0) {
                    r.a aVar3 = this.f1071b;
                    aVar3.getClass();
                    r.d dVar = new r.d(aVar3);
                    aVar3.f11073c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1076g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        s sVar2 = (s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f1068a.compareTo(this.f1072c) < 0 && !this.f1076g && this.f1071b.f11060e.containsKey(sVar2)) {
                            arrayList.add(uVar2.f1068a);
                            l lVar2 = n.Companion;
                            o oVar5 = uVar2.f1068a;
                            lVar2.getClass();
                            i9.l.e(oVar5, "state");
                            int iOrdinal2 = oVar5.ordinal();
                            if (iOrdinal2 == 1) {
                                nVar = n.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                nVar = iOrdinal2 != 3 ? null : n.ON_RESUME;
                            } else {
                                nVar = n.ON_START;
                            }
                            if (nVar == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f1068a);
                            }
                            uVar2.a(tVar, nVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f1076g = false;
        this.f1078i.i(this.f1072c);
    }
}
