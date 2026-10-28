package f5;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import n3.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5291a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5292b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5293c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5294d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5295e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5296f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5297g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5298h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5299i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5300j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code duplicated, block: B:202:0x038c  */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i7) throws XmlPullParserException, IOException {
        int i10;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i11;
        ArrayList arrayList2;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i12;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorD;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i13 = 3;
            boolean z10 = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i14 = 1;
            if (next == 1) {
                break;
            }
            int i15 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorD = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorD = d(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayG = w3.b.g(resources2, theme2, attributeSet, f5298h);
                            a(context, resources2, theme2, r12, attributeSet, animatorSet2, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayG.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayG.recycle();
                            i10 = depth;
                            arrayList = arrayList3;
                            animator2 = animator;
                        } else {
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                            ArrayList arrayList4 = null;
                            while (true) {
                                int eventType = xmlPullParser.getEventType();
                                if (eventType == i13 || eventType == i14) {
                                    break;
                                }
                                if (eventType != i15) {
                                    xmlPullParser.next();
                                } else {
                                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                                        TypedArray typedArrayG2 = w3.b.g(resources2, theme2, attributeSetAsAttributeSet, f5299i);
                                        String strC = w3.b.c(typedArrayG2, xmlPullParser, "propertyName", i13);
                                        int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayG2.getInt(i15, 4) : 4;
                                        int i17 = i16;
                                        ArrayList arrayList5 = null;
                                        while (true) {
                                            int next2 = xmlPullParser.next();
                                            i11 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlPullParser.getName().equals("keyframe")) {
                                                int[] iArr = f5300j;
                                                if (i17 == 4) {
                                                    TypedArray typedArrayG3 = w3.b.g(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                    TypedValue typedValuePeekValue = !w3.b.d(xmlPullParser, "value") ? null : typedArrayG3.peekValue(0);
                                                    int i18 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayG3.recycle();
                                                    i17 = i18;
                                                }
                                                TypedArray typedArrayG4 = w3.b.g(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                float f10 = w3.b.d(xmlPullParser, "fraction") ? typedArrayG4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !w3.b.d(xmlPullParser, "value") ? null : typedArrayG4.peekValue(0);
                                                boolean z11 = typedValuePeekValue2 != null;
                                                int i19 = i17 == 4 ? (z11 && c(typedValuePeekValue2.type)) ? 3 : 0 : i17;
                                                if (!z11) {
                                                    keyframeOfFloat = i19 == 0 ? Keyframe.ofFloat(f10) : Keyframe.ofInt(f10);
                                                } else if (i19 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f10, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayG4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i19 == 1 || i19 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f10, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayG4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayG4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayG4.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList5 == null) {
                                                        arrayList5 = new ArrayList();
                                                    }
                                                    arrayList5.add(keyframeOfFloat);
                                                }
                                                xmlPullParser.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i11;
                                            arrayList3 = arrayList3;
                                        }
                                        arrayList2 = arrayList3;
                                        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                                            propertyValuesHolderB = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i20 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList5.add(arrayList5.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i20++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList5.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i20++;
                                                }
                                            }
                                            int i21 = i20;
                                            Keyframe[] keyframeArr = new Keyframe[i21];
                                            arrayList5.toArray(keyframeArr);
                                            int i22 = 0;
                                            while (i22 < i21) {
                                                Keyframe keyframe3 = keyframeArr[i22];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i12 = i21;
                                                } else {
                                                    if (i22 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i23 = i21 - 1;
                                                        if (i22 == i23) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i24 = i22;
                                                            for (int i25 = i22 + 1; i25 < i23 && keyframeArr[i25].getFraction() < 0.0f; i25++) {
                                                                i24 = i25;
                                                            }
                                                            float fraction3 = (keyframeArr[i24 + 1].getFraction() - keyframeArr[i22 - 1].getFraction()) / ((i24 - i22) + 2);
                                                            int i26 = i22;
                                                            while (i26 <= i24) {
                                                                float f11 = fraction3;
                                                                keyframeArr[i26].setFraction(keyframeArr[i26 - 1].getFraction() + f11);
                                                                i26++;
                                                                i21 = i21;
                                                                fraction3 = f11;
                                                            }
                                                            i12 = i21;
                                                        }
                                                    }
                                                    i12 = i21;
                                                }
                                                i22++;
                                                i21 = i12;
                                            }
                                            propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strC, keyframeArr);
                                            if (i17 == 3) {
                                                propertyValuesHolderB.setEvaluator(g.f5312a);
                                            }
                                        }
                                        if (propertyValuesHolderB == null) {
                                            propertyValuesHolderB = b(typedArrayG2, i16, 0, 1, strC);
                                        }
                                        if (propertyValuesHolderB != null) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(propertyValuesHolderB);
                                        }
                                        typedArrayG2.recycle();
                                    } else {
                                        i11 = depth;
                                        arrayList2 = arrayList3;
                                    }
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i11;
                                    arrayList3 = arrayList2;
                                    i13 = 3;
                                    i14 = 1;
                                    i15 = 2;
                                }
                            }
                            i10 = depth;
                            arrayList = arrayList3;
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i27 = 0; i27 < size2; i27++) {
                                    propertyValuesHolderArr[i27] = (PropertyValuesHolder) arrayList4.get(i27);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            z10 = true;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null || z10) {
                        arrayList3 = arrayList;
                    } else {
                        arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList3.add(animator2);
                    }
                    depth = i10;
                }
                animator = animatorD;
                i10 = depth;
                arrayList = arrayList3;
                animator2 = animator;
                if (animatorSet != null) {
                    arrayList3 = arrayList;
                } else {
                    arrayList3 = arrayList;
                }
                depth = i10;
            }
        }
        ArrayList arrayList6 = arrayList3;
        if (animatorSet != null && arrayList6 != null) {
            Animator[] animatorArr = new Animator[arrayList6.size()];
            Iterator it = arrayList6.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                animatorArr[i28] = (Animator) it.next();
                i28++;
            }
            if (i7 == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i7, int i10, int i11, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        int i13 = z11 ? typedValuePeekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z10 && c(i12)) || (z11 && c(i13))) ? 3 : 0;
        }
        boolean z12 = i7 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i7 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            x3.d[] dVarArrU = r.u(string);
            x3.d[] dVarArrU2 = r.u(string2);
            if (dVarArrU != null || dVarArrU2 != null) {
                if (dVarArrU != null) {
                    f fVar = new f();
                    if (dVarArrU2 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, dVarArrU);
                    }
                    if (r.g(dVarArrU, dVarArrU2)) {
                        return PropertyValuesHolder.ofObject(str, fVar, dVarArrU, dVarArrU2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (dVarArrU2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), dVarArrU2);
                }
            }
            return null;
        }
        g gVar = i7 == 3 ? g.f5312a : null;
        if (z12) {
            if (z10) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i12 == 5) {
                color2 = (int) typedArray.getDimension(i10, 0.0f);
            } else {
                color2 = c(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            }
            if (z11) {
                if (i13 == 5) {
                    color3 = (int) typedArray.getDimension(i11, 0.0f);
                } else {
                    color3 = c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i13 == 5) {
                color = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color = c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && gVar != null) {
            propertyValuesHolderOfInt.setEvaluator(gVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0219  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i7;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayG = w3.b.g(resources, theme, attributeSet, f5297g);
        TypedArray typedArrayG2 = w3.b.g(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j5 = w3.b.d(xmlPullParser, "duration") ? typedArrayG.getInt(1, 300) : 300;
        boolean z10 = false;
        long j10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayG.getInt(2, 0) : 0;
        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayG.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i10 == 4) {
                TypedValue typedValuePeekValue = typedArrayG.peekValue(5);
                boolean z11 = typedValuePeekValue != null;
                int i11 = z11 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayG.peekValue(6);
                boolean z12 = typedValuePeekValue2 != null;
                i10 = ((z11 && c(i11)) || (z12 && c(z12 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayG, i10, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j5);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayG.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayG.getInt(4, 1) : 1);
        if (typedArrayG2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = w3.b.c(typedArrayG2, xmlPullParser, "pathData", 1);
            if (strC != null) {
                String strC2 = w3.b.c(typedArrayG2, xmlPullParser, "propertyXName", 2);
                String strC3 = w3.b.c(typedArrayG2, xmlPullParser, "propertyYName", 3);
                if (i10 != 2) {
                }
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayG2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    x3.d.b(r.u(strC), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    while (true) {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        z10 = false;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, z10);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f10 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    float f11 = 0.0f;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 >= iMin) {
                            break;
                        }
                        int i14 = iMin;
                        pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                        fArr[i12] = fArr3[0];
                        fArr2[i12] = fArr3[1];
                        int i15 = i13 + 1;
                        f11 += f10;
                        if (i15 < arrayList.size() && f11 > ((Float) arrayList.get(i15)).floatValue()) {
                            pathMeasure2.nextContour();
                            i13 = i15;
                        }
                        i12++;
                        iMin = i14;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strC2 != null ? PropertyValuesHolder.ofFloat(strC2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strC3 != null ? PropertyValuesHolder.ofFloat(strC3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                } catch (RuntimeException e7) {
                    throw new RuntimeException("Error in parsing ".concat(strC), e7);
                }
            } else {
                valueAnimator = valueAnimator3;
                i7 = 0;
                objectAnimator2.setPropertyName(w3.b.c(typedArrayG2, xmlPullParser, "propertyName", 0));
            }
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
                resourceId = typedArrayG.getResourceId(i7, i7);
            } else {
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArrayG.recycle();
            if (typedArrayG2 != null) {
                typedArrayG2.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        i7 = 0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayG.getResourceId(i7, i7);
        } else {
            resourceId = 0;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayG.recycle();
        if (typedArrayG2 != null) {
            typedArrayG2.recycle();
        }
        return valueAnimator2;
    }
}
