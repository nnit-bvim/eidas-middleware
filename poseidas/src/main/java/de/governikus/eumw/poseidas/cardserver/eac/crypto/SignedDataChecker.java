/*
 * Copyright (c) 2018 Governikus KG. Licensed under the EUPL, Version 1.2 or as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence"); You may not use this work except
 * in compliance with the Licence. You may obtain a copy of the Licence at:
 * http://joinup.ec.europa.eu/software/page/eupl Unless required by applicable law or agreed to in writing,
 * software distributed under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */

package de.governikus.eumw.poseidas.cardserver.eac.crypto;


/**
 * Interface for checkers used to verify signature of EF.CardSecurity.
 * 
 * @author Arne Stahlbock, ast@bos-bremen.de
 */
public interface SignedDataChecker
{

  /**
   * Checks if EF.CardSecurity has valid signature.
   * 
   * @param data content of EF.CardSecurity as byte-array
   * @return result of check
   */
  public abstract boolean checkSignedData(byte[] data);
}
