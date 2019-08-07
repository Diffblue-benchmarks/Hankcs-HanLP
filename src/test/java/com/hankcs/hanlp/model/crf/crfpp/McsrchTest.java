package com.hankcs.hanlp.model.crf.crfpp;

import com.hankcs.hanlp.model.crf.crfpp.Mcsrch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class McsrchTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Mcsrch */
  // Test written by Diffblue Cover.
  @Test
  public void ddot_InputPositive10Positive2ZeroOutputNegative() {

    // Arrange
    final int size = 1;
    final double[] dx = {22.0,
                         0x1p+1022 /* 4.49423e+307 */,
                         0x1.009800400000dp-799 /* 3.00635e-241 */,
                         0x1p+102 /* 5.0706e+30 */,
                         0x0.5080888p-1022 /* 6.997e-309 */,
                         0x1.d89d88489401p+99 /* 1.17014e+30 */,
                         0x1.d89d89d89d89cp+99 /* 1.17014e+30 */,
                         0x1.d89d8bd89d89dp+99 /* 1.17014e+30 */,
                         0x1.d89d89d89d89dp+99 /* 1.17014e+30 */,
                         0x1p+1022 /* 4.49423e+307 */};
    final int offsetX = 8;
    final double[] dy = {-0x0.000000000000dp-1022 /* -6.42285e-323 */, -0.0};
    final int offsetY = 0;

    // Act
    final double actual = Mcsrch.ddot_(size, dx, offsetX, dy, offsetY);

    // Assert result
    Assert.assertEquals(-0x1.8p-971 /* -7.51563e-293 */, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ddot_InputZeroNullPositiveNullPositiveOutputZero() {

    // Arrange
    final int size = 0;
    final double[] dx = null;
    final int offsetX = 16;
    final double[] dy = null;
    final int offsetY = 520;

    // Act
    final double actual = Mcsrch.ddot_(size, dx, offsetX, dy, offsetY);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcsrchInputPositive0Zero00Zero1100OutputVoid() throws InvocationTargetException {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    objectUnderTest.dgx = 0.0;
    objectUnderTest.infoc = 0;
    objectUnderTest.stage1 = false;
    objectUnderTest.brackt = false;
    objectUnderTest.stx = 0.0;
    objectUnderTest.stmin = 0.0;
    objectUnderTest.stmax = 0.0;
    objectUnderTest.dginit = 0.0;
    objectUnderTest.dgy = 0.0;
    objectUnderTest.sty = 0.0;
    objectUnderTest.finit = 0.0;
    objectUnderTest.fy = 0.0;
    objectUnderTest.dgtest = 0.0;
    objectUnderTest.width1 = 0.0;
    objectUnderTest.width = 0.0;
    objectUnderTest.fx = 0.0;
    final int size = 1;
    final double[] x = {};
    final double f = 0.0;
    final double[] g = {};
    final double[] s = {};
    final int startOffset = 0;
    final double[] stp = {0.0};
    final int[] info = {0};
    final int[] nfev = {};
    final double[] wa = {};

    // Act
    objectUnderTest.mcsrch(size, x, f, g, s, startOffset, stp, info, nfev, wa);

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.infoc);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcsrchInputPositive0Zero11Zero1100OutputVoid() throws InvocationTargetException {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    objectUnderTest.dgx = 0.0;
    objectUnderTest.infoc = 0;
    objectUnderTest.stage1 = false;
    objectUnderTest.brackt = false;
    objectUnderTest.stx = 0.0;
    objectUnderTest.stmin = 0.0;
    objectUnderTest.stmax = 0.0;
    objectUnderTest.dginit = 0.0;
    objectUnderTest.dgy = 0.0;
    objectUnderTest.sty = 0.0;
    objectUnderTest.finit = 0.0;
    objectUnderTest.fy = 0.0;
    objectUnderTest.dgtest = 0.0;
    objectUnderTest.width1 = 0.0;
    objectUnderTest.width = 0.0;
    objectUnderTest.fx = 0.0;
    final int size = 1;
    final double[] x = {};
    final double f = 0.0;
    final double[] g = {-0.0};
    final double[] s = {0x1p+381 /* 4.92525e+114 */};
    final int startOffset = 0;
    final double[] stp = {Double.NaN};
    final int[] info = {0};
    final int[] nfev = {};
    final double[] wa = {};

    // Act
    objectUnderTest.mcsrch(size, x, f, g, s, startOffset, stp, info, nfev, wa);

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.infoc);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcsrchInputPositive2Zero116Zero1221OutputVoid() throws InvocationTargetException {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    objectUnderTest.dgx = 0.0;
    objectUnderTest.infoc = 0;
    objectUnderTest.stage1 = false;
    objectUnderTest.brackt = false;
    objectUnderTest.stx = 0.0;
    objectUnderTest.stmin = 0.0;
    objectUnderTest.stmax = 0.0;
    objectUnderTest.dginit = 0.0;
    objectUnderTest.dgy = 0.0;
    objectUnderTest.sty = 0.0;
    objectUnderTest.finit = 0.0;
    objectUnderTest.fy = 0.0;
    objectUnderTest.dgtest = 0.0;
    objectUnderTest.width1 = 0.0;
    objectUnderTest.width = 0.0;
    objectUnderTest.fx = 0.0;
    final int size = 1;
    final double[] x = {0x0.80000027fffdfp-1022 /* 1.11254e-308 */, 0.0};
    final double f = 0.0;
    final double[] g = {Double.NaN};
    final double[] s = {
        -0x1.e0f12d2d2c3c4p+304 /* -6.1231e+91 */,  -0x1.000000000007dp+52 /* -4.5036e+15 */,
        -0x1.0000012c003fdp+52 /* -4.5036e+15 */,   -0x1.00f10000003fdp+52 /* -4.52016e+15 */,
        -0x1.80000000003fdp+236 /* -1.65642e+71 */, -0x1.e0f1292d2c3ccp+304 /* -6.1231e+91 */,
        -0x1.00000000000f5p+52 /* -4.5036e+15 */,   -0x1.0000002d203fdp+52 /* -4.5036e+15 */,
        -0x1.00304000003fdp+52 /* -4.50692e+15 */,  -0x1.e0000000003fdp+36 /* -1.28849e+11 */,
        0x1.00000000003fdp+52 /* 4.5036e+15 */,     -0x1.0000000000375p+52 /* -4.5036e+15 */,
        -0x1.0000000d2c3fdp+52 /* -4.5036e+15 */,   -0x1.20004d20003fdp+52 /* -5.06657e+15 */,
        -0x1.a0c00000003fdp+52 /* -7.33154e+15 */,  0x1.00000000003fdp+180 /* 1.5325e+54 */};
    final int startOffset = 0;
    final double[] stp = {Double.NaN};
    final int[] info = {0, 0};
    final int[] nfev = {0, 0};
    final double[] wa = {0.0};

    // Act
    objectUnderTest.mcsrch(size, x, f, g, s, startOffset, stp, info, nfev, wa);

    // Assert side effects
    Assert.assertEquals(Double.NaN, objectUnderTest.dgx, 0.0);
    Assert.assertEquals(1, objectUnderTest.infoc);
    Assert.assertTrue(objectUnderTest.stage1);
    Assert.assertEquals(Double.NaN, objectUnderTest.stmax, 0.0);
    Assert.assertEquals(Double.NaN, objectUnderTest.dginit, 0.0);
    Assert.assertEquals(Double.NaN, objectUnderTest.dgy, 0.0);
    Assert.assertEquals(Double.NaN, objectUnderTest.dgtest, 0.0);
    Assert.assertEquals(2e+20, objectUnderTest.width1, 0.0);
    Assert.assertEquals(1e+20, objectUnderTest.width, 0.0);
    Assert.assertArrayEquals(new int[] {-1, 0}, info);
    Assert.assertArrayEquals(new double[] {Double.NaN, 0.0}, x, 0.0);
    Assert.assertArrayEquals(new double[] {0x0.80000027fffdfp-1022 /* 1.11254e-308 */}, wa, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcsrchInputZero0Zero00Zero2110OutputVoid() throws InvocationTargetException {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    objectUnderTest.dgx = 0.0;
    objectUnderTest.infoc = 0;
    objectUnderTest.stage1 = false;
    objectUnderTest.brackt = false;
    objectUnderTest.stx = 0.0;
    objectUnderTest.stmin = 0.0;
    objectUnderTest.stmax = 0.0;
    objectUnderTest.dginit = 0.0;
    objectUnderTest.dgy = 0.0;
    objectUnderTest.sty = 0.0;
    objectUnderTest.finit = Double.NaN;
    objectUnderTest.fy = 0.0;
    objectUnderTest.dgtest = -0x1.8p-481 /* -2.4025e-145 */;
    objectUnderTest.width1 = 0.0;
    objectUnderTest.width = 0.0;
    objectUnderTest.fx = 0.0;
    final int size = 0;
    final double[] x = {};
    final double f = 0.0;
    final double[] g = {};
    final double[] s = {};
    final int startOffset = 0;
    final double[] stp = {Double.NaN, 0.0};
    final int[] info = {-1};
    final int[] nfev = {28};
    final double[] wa = {};

    // Act
    objectUnderTest.mcsrch(size, x, f, g, s, startOffset, stp, info, nfev, wa);

    // Assert side effects
    Assert.assertArrayEquals(new int[] {29}, nfev);
    Assert.assertArrayEquals(new int[] {3}, info);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcsrchInputZeroNullNaNNullNullPositive21NullNullOutputVoid() {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    final int size = 0;
    final double[] x = null;
    final double f = Double.NaN;
    final double[] g = null;
    final double[] s = null;
    final int startOffset = 1_048_576;
    final double[] stp = {-0x1.195200000ap+578 /* -1.08717e+174 */, 0.0};
    final int[] info = {-138_510_337};
    final int[] nfev = null;
    final double[] wa = null;

    // Act
    objectUnderTest.mcsrch(size, x, f, g, s, startOffset, stp, info, nfev, wa);

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.infoc);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput2Null122NullNullPositivePositive1NaNNegative8OutputNullPointerException() {

    // Arrange
    final double[] stx = {Double.NaN, 0.0};
    final double[] fx = null;
    final double[] dx = {-0x1.000000000004p-1020 /* -8.9003e-308 */};
    final double[] sty = {Double.NaN, 0.0};
    final double[] fy = {0x1.4011400080092p-994 /* 7.46768e-300 */, 0.0};
    final double[] dy = null;
    final double[] stp = null;
    final double fp = 0x1.40114p-994 /* 7.46768e-300 */;
    final double dp = 0x1p-1021 /* 4.45015e-308 */;
    final boolean[] brackt = {false};
    final double stpmin = Double.NaN;
    final double stpmax = -0x1.0000010000001p+0 /* -1.0 */;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    thrown.expect(NullPointerException.class);
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput22Null22NullNullPositivePositive1NaNNegative8OutputNullPointerException() {

    // Arrange
    final double[] stx = {Double.NaN, 0.0};
    final double[] fx = {0x1.0c055d942dab2p-963 /* 1.3429e-290 */, 0.0};
    final double[] dx = null;
    final double[] sty = {Double.NaN, 0.0};
    final double[] fy = {0x1.4011400080092p-994 /* 7.46768e-300 */, 0.0};
    final double[] dy = null;
    final double[] stp = null;
    final double fp = 0x1.40114p-994 /* 7.46768e-300 */;
    final double dp = 0x1p-1021 /* 4.45015e-308 */;
    final boolean[] brackt = {false};
    final double stpmin = Double.NaN;
    final double stpmax = -0x1.0000010000001p+0 /* -1.0 */;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    thrown.expect(NullPointerException.class);
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  mcstepInput22122Null0PositiveNegative1NaNNegative8OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final double[] stx = {Double.NaN, 0.0};
    final double[] fx = {0x1.00474000000b3p-963 /* 1.28406e-290 */, 0.0};
    final double[] dx = {-0x0.5bf101f28213p-1022 /* -7.99127e-309 */};
    final double[] sty = {Double.NaN, 0.0};
    final double[] fy = {0x1.4041400080092p-994 /* 7.47206e-300 */, 0.0};
    final double[] dy = null;
    final double[] stp = {};
    final double fp = 0x1.40414p-994 /* 7.47206e-300 */;
    final double dp = -0x1p+128 /* -3.40282e+38 */;
    final boolean[] brackt = {false};
    final double stpmin = Double.NaN;
    final double stpmax = -0x1.0180010200081p+0 /* -1.00586 */;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};
    try {

      // Act
      thrown.expect(ArrayIndexOutOfBoundsException.class);
      Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);
    } catch (ArrayIndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertArrayEquals(new int[] {4, 0, 0, 0, 0, 0, 0, 0}, info);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput2212201PositiveNegative1NaNNaN8OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final double[] stx = {Double.NaN, 0.0};
    final double[] fx = {0x1.0047400000233p-963 /* 1.28406e-290 */, 0.0};
    final double[] dx = {-0x0.5bf101f28213p-1022 /* -7.99127e-309 */};
    final double[] sty = {Double.NaN, 0.0};
    final double[] fy = {0x1.4045400080092p-994 /* 7.47242e-300 */, 0.0};
    final double[] dy = {};
    final double[] stp = {Double.NaN};
    final double fp = 0x1.40454p-994 /* 7.47242e-300 */;
    final double dp = -0x1p+128 /* -3.40282e+38 */;
    final boolean[] brackt = {true};
    final double stpmin = Double.NaN;
    final double stpmax = Double.NaN;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};
    try {

      // Act
      thrown.expect(ArrayIndexOutOfBoundsException.class);
      Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);
    } catch (ArrayIndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertArrayEquals(new int[] {4, 0, 0, 0, 0, 0, 0, 0}, info);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput2212211NegativeNegative1NaNNaN8OutputVoid() {

    // Arrange
    final double[] stx = {0.0, 0.0};
    final double[] fx = {-0x1.b4p-982 /* -4.16669e-296 */, 0.0};
    final double[] dx = {Double.POSITIVE_INFINITY};
    final double[] sty = {-0x1p+517 /* -4.2905e+155 */, 0.0};
    final double[] fy = {-0x1.b4000000000afp-982 /* -4.16669e-296 */, 0.0};
    final double[] dy = {0x1.00000008p+1016 /* 7.02224e+305 */};
    final double[] stp = {Double.NaN};
    final double fp = -0x1.b40000000002p-982 /* -4.16669e-296 */;
    final double dp = -0x0.6e17a08e1e176p-1022 /* -9.56889e-309 */;
    final boolean[] brackt = {true};
    final double stpmin = Double.NaN;
    final double stpmax = Double.NaN;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Assert side effects
    Assert.assertArrayEquals(new double[] {-0x0.6e17a08e1e176p-1022 /* -9.56889e-309 */}, dx, 0.0);
    Assert.assertArrayEquals(new double[] {-0x1.b40000000002p-982 /* -4.16669e-296 */, 0.0}, fx,
                             0.0);
    Assert.assertArrayEquals(new double[] {Double.NaN, 0.0}, stx, 0.0);
    Assert.assertArrayEquals(new int[] {3, 0, 0, 0, 0, 0, 0, 0}, info);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput2212211NegativeNegative1NaNNaN8OutputVoid2() {

    // Arrange
    final double[] stx = {0.0, 0.0};
    final double[] fx = {-0x1.b4p-982 /* -4.16669e-296 */, 0.0};
    final double[] dx = {Double.POSITIVE_INFINITY};
    final double[] sty = {-0x1p+517 /* -4.2905e+155 */, 0.0};
    final double[] fy = {-0x1.b4000000000afp-982 /* -4.16669e-296 */, 0.0};
    final double[] dy = {0x1.00000008p+1016 /* 7.02224e+305 */};
    final double[] stp = {Double.NaN};
    final double fp = -0x1.b40000000002p-982 /* -4.16669e-296 */;
    final double dp = -0x0.6e17a08e1e176p-1022 /* -9.56889e-309 */;
    final boolean[] brackt = {false};
    final double stpmin = Double.NaN;
    final double stpmax = Double.NaN;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Assert side effects
    Assert.assertArrayEquals(new double[] {-0x0.6e17a08e1e176p-1022 /* -9.56889e-309 */}, dx, 0.0);
    Assert.assertArrayEquals(new double[] {-0x1.b40000000002p-982 /* -4.16669e-296 */, 0.0}, fx,
                             0.0);
    Assert.assertArrayEquals(new double[] {Double.NaN, 0.0}, stx, 0.0);
    Assert.assertArrayEquals(new int[] {3, 0, 0, 0, 0, 0, 0, 0}, info);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput2212211PositiveNegative1NaNNaN8OutputVoid() {

    // Arrange
    final double[] stx = {Double.NaN, 0.0};
    final double[] fx = {0x1.0047400000233p-963 /* 1.28406e-290 */, 0.0};
    final double[] dx = {-0x0.5bf101f28213p-1022 /* -7.99127e-309 */};
    final double[] sty = {Double.NaN, 0.0};
    final double[] fy = {0x1.0045400080092p-994 /* 5.9792e-300 */, 0.0};
    final double[] dy = {Double.NaN};
    final double[] stp = {Double.NaN};
    final double fp = 0x1.00454p-994 /* 5.9792e-300 */;
    final double dp = -0x1p+128 /* -3.40282e+38 */;
    final boolean[] brackt = {true};
    final double stpmin = Double.NaN;
    final double stpmax = Double.NaN;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Assert side effects
    Assert.assertArrayEquals(new double[] {-0x1p+128 /* -3.40282e+38 */}, dx, 0.0);
    Assert.assertArrayEquals(new double[] {0x1.00454p-994 /* 5.9792e-300 */, 0.0}, fx, 0.0);
    Assert.assertArrayEquals(new int[] {4, 0, 0, 0, 0, 0, 0, 0}, info);
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  mcstepInput011605017NegativeNegative1PositivePositive16OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final double[] stx = {};
    final double[] fx = {-0x1.0057fff8p-1010 /* -9.12614e-305 */};
    final double[] dx = {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                         0.0,        0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    final double[] sty = {};
    final double[] fy = {-0x1.00a87e01e7c8p-1014 /* -5.71083e-306 */, 0.0, 0.0, 0.0, 0.0};
    final double[] dy = {};
    final double[] stp = {-0x1.001205fffdddfp+128 /* -3.40376e+38 */,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0};
    final double fp = -0x1.ffffffp-1015 /* -5.69619e-306 */;
    final double dp = -0x1.00000000008p-881 /* -6.2026e-266 */;
    final boolean[] brackt = {false};
    final double stpmin = 0x1.8p+64 /* 2.76701e+19 */;
    final double stpmax = 0x1.8p+384 /* 5.9103e+115 */;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    try {

      // Act
      thrown.expect(ArrayIndexOutOfBoundsException.class);
      Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);
    } catch (ArrayIndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, info);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void mcstepInput161168514NegativeNegative1PositiveNaN16OutputVoid() {

    // Arrange
    final double[] stx = {-0x1.ffffffe00008p-970 /* -2.00417e-292 */,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0,
                          0.0};
    final double[] fx = {-0x1.fffffffff5555p-1022 /* -4.45015e-308 */};
    final double[] dx = {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                         0.0,        0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    final double[] sty = {
        -0x1.ffffffc0000ffp-971 /* -1.00208e-292 */, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    final double[] fy = {-0x1.5555555d55555p-992 /* -3.18554e-299 */, 0.0, 0.0, 0.0, 0.0};
    final double[] dy = {-0x1.0000000000001p+766 /* -3.8813e+230 */};
    final double[] stp = {-0x1.ffffffe00008p-970 /* -2.00417e-292 */, 0.0, 0.0, 0.0};
    final double fp = -0x1p-1021 /* -4.45015e-308 */;
    final double dp = -0x1.e008000000081p-144 /* -8.40834e-44 */;
    final boolean[] brackt = {false};
    final double stpmin = 0x1.8p+64 /* 2.76701e+19 */;
    final double stpmax = Double.NaN;
    final int[] info = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    Mcsrch.mcstep(stx, fx, dx, sty, fy, dy, stp, fp, dp, brackt, stpmin, stpmax, info);

    // Assert side effects
    Assert.assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0}, stp, 0.0);
    Assert.assertArrayEquals(new double[] {-0x1.e008000000081p-144 /* -8.40834e-44 */, 0.0, 0.0,
                                           0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                                           0.0, 0.0},
                             dx, 0.0);
    Assert.assertArrayEquals(new double[] {-0x1p-1021 /* -4.45015e-308 */}, fx, 0.0);
    Assert.assertArrayEquals(new int[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, info);
  }

  // Test written by Diffblue Cover.
  @Test
  public void piInputPositiveZeroOutputZero() {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    final double x = 2.0;
    final double y = 0.0;

    // Act
    final double actual = objectUnderTest.pi(x, y);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void piInputZeroZeroOutputZero() {

    // Arrange
    final Mcsrch objectUnderTest = new Mcsrch();
    final double x = 0.0;
    final double y = 0.0;

    // Act
    final double actual = objectUnderTest.pi(x, y);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sigmaInputNegativeOutputNegative() {

    // Arrange
    final double x = -0x0.0000000000001p-1022 /* -4.94066e-324 */;

    // Act
    final double actual = Mcsrch.sigma(x);

    // Assert result
    Assert.assertEquals(-1.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sigmaInputPositiveOutputPositive() {

    // Arrange
    final double x = 0x1.00001p+0 /* 1.0 */;

    // Act
    final double actual = Mcsrch.sigma(x);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sigmaInputZeroOutputZero() {

    // Arrange
    final double x = 0.0;

    // Act
    final double actual = Mcsrch.sigma(x);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }
}
