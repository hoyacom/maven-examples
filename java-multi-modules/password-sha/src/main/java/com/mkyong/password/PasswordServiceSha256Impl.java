package com.mkyong.password;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * SHA256 PasswordService 구현체
 *
 * <br>
 * Created Date : 19 Feb 2019
 * 
 * @author hoyacom
 * @since
 *
 */
@Service
public class PasswordServiceSha256Impl implements PasswordService
{

  @Override
  public String hash(String input)
  {
    return DigestUtils.sha256Hex(input);
  }

  @Override
  public String algorithm()
  {
    return "sha256";
  }

}
