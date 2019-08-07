package com.hankcs.hanlp.classification.statistics;

import static org.mockito.Matchers.anyDouble;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.hankcs.hanlp.classification.statistics.ContinuousDistributions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class ContinuousDistributionsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ContinuousDistributions */
  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void ChisquareCdfInputNaNPositiveOutputNaN() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = Double.NaN;
    final int df = 1;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(Double.POSITIVE_INFINITY)
        .thenReturn(-0x1.008001p+1021 /* -2.25151e+307 */)
        .thenReturn(-0x1p+518 /* -8.581e+155 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0.0);

    // Act
    final double actual = ContinuousDistributions.ChisquareCdf(x, df);

    // Assert result
    Assert.assertEquals(Double.NaN, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ChisquareCdfInputNegativePositiveOutputIllegalArgumentException()
      throws IllegalArgumentException {

    // Arrange
    final double x = -0x0.0000000000007p-1022 /* -3.45846e-323 */;
    final int df = 1;

    // Act
    thrown.expect(IllegalArgumentException.class);
    ContinuousDistributions.ChisquareCdf(x, df);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void ChisquareCdfInputPositivePositiveOutputPositive() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = 0x1.b2fcc40000015p-23 /* 2.02557e-07 */;
    final int df = 1;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(-0x1.0000000000004p+763 /* -4.85162e+229 */)
        .thenReturn(-0x1.fffffffb7fffep+126 /* -1.70141e+38 */)
        .thenReturn(0x1.3fffffff57f5p+2 /* 5.0 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0x1.0033ac9e9d658p+906 /* 5.414e+272 */);

    // Act
    final double actual = ContinuousDistributions.ChisquareCdf(x, df);

    // Assert result
    Assert.assertEquals(0x1.0033adc0d5c6ap+907 /* 1.0828e+273 */, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ChisquareCdfInputZeroZeroOutputIllegalArgumentException()
      throws IllegalArgumentException {

    // Arrange
    final double x = 0.0;
    final int df = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    ContinuousDistributions.ChisquareCdf(x, df);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void ChisquareInverseCdfInputNaNPositiveOutputNaN() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double p = Double.NaN;
    final int df = 38;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(-0x1.d16028081adacp+264 /* -5.38868e+79 */)
        .thenReturn(-0x1.f806ca11024e7p+904 /* -2.66274e+272 */)
        .thenReturn(0x1p+1019 /* 5.61779e+306 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(16.0);

    // Act
    final double actual = ContinuousDistributions.ChisquareInverseCdf(p, df);

    // Assert result
    Assert.assertEquals(Double.NaN, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ChisquareInverseCdfInputNaNZeroOutputIllegalArgumentException() {

    // Arrange
    final double p = Double.NaN;
    final int df = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    ContinuousDistributions.ChisquareInverseCdf(p, df);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ChisquareInverseCdfInputPositiveZeroOutputZero() {

    // Arrange
    final double p = 0x1.0000000000004p+0 /* 1.0 */;
    final int df = 0;

    // Act
    final double actual = ContinuousDistributions.ChisquareInverseCdf(p, df);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ChisquareInverseCdfInputZeroZeroOutputPositive() {

    // Arrange
    final double p = 0.0;
    final int df = 0;

    // Act
    final double actual = ContinuousDistributions.ChisquareInverseCdf(p, df);

    // Assert result
    Assert.assertEquals(99999.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GammaCdfInputNegativeNaNOutputIllegalArgumentException()
      throws IllegalArgumentException {

    // Arrange
    final double x = -0x0.0000fffffffffp-1022 /* -3.39519e-313 */;
    final double a = Double.NaN;

    // Act
    thrown.expect(IllegalArgumentException.class);
    ContinuousDistributions.GammaCdf(x, a);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void GammaCdfInputPositivePositiveInfinityOutputNaN() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = 0x1.529578p-34 /* 7.69851e-11 */;
    final double a = Double.POSITIVE_INFINITY;
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(Double.NaN);

    // Act
    final double actual = ContinuousDistributions.GammaCdf(x, a);

    // Assert result
    Assert.assertEquals(Double.NaN, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void GammaCdfInputPositiveZeroOutputPositiveInfinity() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = 0x1.7fff40130154p-1015 /* 4.27211e-306 */;
    final double a = 0.0;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(0x1.00084480001p+125 /* 4.25407e+37 */)
        .thenReturn(-9.0)
        .thenReturn(0x1.002001p-1016 /* 1.42474e-306 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0x1.914018007p+105 /* 6.35807e+31 */);

    // Act
    final double actual = ContinuousDistributions.GammaCdf(x, a);

    // Assert result
    Assert.assertEquals(Double.POSITIVE_INFINITY, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GaussCdfInputNegativeOutputPositive() {

    // Arrange
    final double z = -3.0;

    // Act
    final double actual = ContinuousDistributions.GaussCdf(z);

    // Assert result
    Assert.assertEquals(0x1.61de1537cd8p-10 /* 0.0013499 */, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GaussCdfInputNegativeOutputPositive2() {

    // Arrange
    final double z = -0x1.fffffffp-800 /* -2.99939e-241 */;

    // Act
    final double actual = ContinuousDistributions.GaussCdf(z);

    // Assert result
    Assert.assertEquals(0.5, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GaussCdfInputNegativeOutputZero() {

    // Arrange
    final double z = -0x1.800000000008p+129 /* -1.02085e+39 */;

    // Act
    final double actual = ContinuousDistributions.GaussCdf(z);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GaussCdfInputPositiveOutputPositive() {

    // Arrange
    final double z = 0x1p+736 /* 3.61474e+221 */;

    // Act
    final double actual = ContinuousDistributions.GaussCdf(z);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void GaussCdfInputZeroOutputPositive() {

    // Arrange
    final double z = -0.0;

    // Act
    final double actual = ContinuousDistributions.GaussCdf(z);

    // Assert result
    Assert.assertEquals(0.5, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void GcfInputNegativeNaNOutputNaN() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = -0x1p+118 /* -3.32307e+35 */;
    final double A = Double.NaN;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(-0x1.4a2d8839a88dp+120 /* -1.71438e+36 */)
        .thenReturn(Double.NaN)
        .thenReturn(Double.NaN);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0.0);

    // Act
    final double actual = ContinuousDistributions.Gcf(x, A);

    // Assert result
    Assert.assertEquals(Double.NaN, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void GserInputNegativePositiveOutputPositive() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = -0x1.00000bdb2p+1021 /* -2.24712e+307 */;
    final double A = 0x1p+1022 /* 4.49423e+307 */;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(Double.NaN)
        .thenReturn(1.0)
        .thenReturn(-0x1.00000002p-987 /* -7.6453e-298 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0x1.488f6a50b4021p+1022 /* 5.76807e+307 */);

    // Act
    final double actual = ContinuousDistributions.Gser(x, A);

    // Assert result
    Assert.assertEquals(0x1.488f5b194eaebp-1 /* 0.641719 */, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void GserInputPositiveNegativeOutputNegativeInfinity() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double x = 0x1.c00000000007fp-1022 /* 3.89388e-308 */;
    final double A = -0x0.12f7095b11347p-1022 /* -1.64838e-309 */;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(-0x0.6004411200002p-1022 /* -8.34547e-309 */)
        .thenReturn(0x0.4000000000004p-1022 /* 5.56268e-309 */)
        .thenReturn(0x1.f847fffffffffp+12 /* 8068.5 */);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(0x1.311018p+96 /* 9.44124e+28 */);

    // Act
    final double actual = ContinuousDistributions.Gser(x, A);

    // Assert result
    Assert.assertEquals(Double.NEGATIVE_INFINITY, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ContinuousDistributions.class, Math.class})
  @Test
  public void LogGammaInputNegativeOutputPositive() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final double Z = -3.0;
    PowerMockito.when(Math.log(anyDouble()))
        .thenReturn(-0x1.727e35894f4c4p+77 /* -2.187e+23 */)
        .thenReturn(-0x1.4000400a00007p+61 /* -2.88231e+18 */);

    // Act
    final double actual = ContinuousDistributions.LogGamma(Z);

    // Assert result
    Assert.assertEquals(0x1.442e1ed815604p+79 /* 7.65449e+23 */, actual, 0.0);
  }
}
