package bf.tdev.consulting.services;

import bf.tdev.consulting.dto.CustomerDto;

public interface IAccountsService {


    /**
     *
     * @param customerDto-CustomerDto Object
     * */
    void createAccount(CustomerDto customerDto);

   CustomerDto fetchAccount(String mobileNumber);

   boolean updateAccount(CustomerDto customerDto);

   boolean deleteAccount(String mobileNumber);
}
