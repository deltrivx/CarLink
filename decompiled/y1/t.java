package y1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final ColorSpace a(z1.c cVar) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        if (i9.l.a(cVar, z1.d.f15625e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (i9.l.a(cVar, z1.d.f15636q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (i9.l.a(cVar, z1.d.f15637r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (i9.l.a(cVar, z1.d.f15634o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (i9.l.a(cVar, z1.d.f15630j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (i9.l.a(cVar, z1.d.f15629i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (i9.l.a(cVar, z1.d.f15639t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (i9.l.a(cVar, z1.d.f15638s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (i9.l.a(cVar, z1.d.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (i9.l.a(cVar, z1.d.f15631l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (i9.l.a(cVar, z1.d.f15627g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (i9.l.a(cVar, z1.d.f15628h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (i9.l.a(cVar, z1.d.f15626f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (i9.l.a(cVar, z1.d.f15632m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (i9.l.a(cVar, z1.d.f15635p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (i9.l.a(cVar, z1.d.f15633n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (i9.l.a(cVar, z1.d.f15641v)) {
                    colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                } else {
                    colorSpace2 = i9.l.a(cVar, z1.d.f15642w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (cVar instanceof z1.q) {
                String str = cVar.f15618a;
                z1.q qVar = (z1.q) cVar;
                float[] fArrA = qVar.f15672d.a();
                z1.r rVar = qVar.f15675g;
                ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f15686b, rVar.f15687c, rVar.f15688d, rVar.f15689e, rVar.f15690f, rVar.f15691g, rVar.f15685a) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, qVar.f15676h, fArrA, transferParameters);
                }
                float[] fArr = qVar.f15676h;
                final z1.p pVar = qVar.f15679l;
                final int i7 = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: y1.s
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        switch (i7) {
                            case 0:
                                break;
                        }
                        return ((Number) pVar.invoke(Double.valueOf(d10))).doubleValue();
                    }
                };
                final z1.p pVar2 = qVar.f15682o;
                final int i10 = 1;
                return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: y1.s
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        switch (i10) {
                            case 0:
                                break;
                        }
                        return ((Number) pVar2.invoke(Double.valueOf(d10))).doubleValue();
                    }
                }, qVar.f15673e, qVar.f15674f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }
}
