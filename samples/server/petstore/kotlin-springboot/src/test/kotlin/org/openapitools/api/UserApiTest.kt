package org.openapitools.api

import org.openapitools.model.User
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UserApiTest {

    private val service: UserApiService = UserApiServiceImpl()
    private val api: UserApiController = UserApiController(service)

    /**
     * To test UserApiController.createUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createUserTest() {
        val body:User = TODO()
        val response: ResponseEntity<Unit> = api.createUser(body)

        // TODO: test validations
    }

    /**
     * To test UserApiController.createUsersWithArrayInput
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createUsersWithArrayInputTest() {
        val body:kotlin.collections.List<User> = TODO()
        val response: ResponseEntity<Unit> = api.createUsersWithArrayInput(body)

        // TODO: test validations
    }

    /**
     * To test UserApiController.createUsersWithListInput
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createUsersWithListInputTest() {
        val body:kotlin.collections.List<User> = TODO()
        val response: ResponseEntity<Unit> = api.createUsersWithListInput(body)

        // TODO: test validations
    }

    /**
     * To test UserApiController.deleteUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteUserTest() {
        val username:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.deleteUser(username)

        // TODO: test validations
    }

    /**
     * To test UserApiController.getUserByName
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getUserByNameTest() {
        val username:kotlin.String = TODO()
        val response: ResponseEntity<User> = api.getUserByName(username)

        // TODO: test validations
    }

    /**
     * To test UserApiController.loginUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun loginUserTest() {
        val username:kotlin.String = TODO()
        val password:kotlin.String = TODO()
        val response: ResponseEntity<kotlin.String> = api.loginUser(username, password)

        // TODO: test validations
    }

    /**
     * To test UserApiController.logoutUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun logoutUserTest() {
        val response: ResponseEntity<Unit> = api.logoutUser()

        // TODO: test validations
    }

    /**
     * To test UserApiController.updateUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateUserTest() {
        val username:kotlin.String = TODO()
        val body:User = TODO()
        val response: ResponseEntity<Unit> = api.updateUser(username, body)

        // TODO: test validations
    }

}
