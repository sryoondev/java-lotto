package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LottoNumberTest {

  @Test(expected = IllegalArgumentException.class)
  public void test_lottoNumber_constructor_number_by_0() {

    // Given
    int number = 0;

    // When
    LottoNumber.getInstance(number);
  }

  @Test
  public void test_lottoNumber_constructor_number() {

    // Given
    int number = 23;

    // When
    LottoNumber lottoNumber = LottoNumber.getInstance(number);

    // Then
    assertThat(lottoNumber).isNotNull();
  }

  @Test(expected = IllegalArgumentException.class)
  public void test_lottoNumber_constructor_number_by_50() {

    // Given
    int number = 50;

    // When
    LottoNumber.getInstance(number);
  }
}