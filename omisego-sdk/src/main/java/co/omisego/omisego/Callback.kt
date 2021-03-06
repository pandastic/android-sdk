package co.omisego.omisego

import co.omisego.omisego.models.ApiError
import co.omisego.omisego.models.Response


/**
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 11/12/2017 AD.
 * Copyright © 2017 OmiseGO. All rights reserved.
 */

/**
 * A callback that represents whether an API request was successful or returned an error.
 *
 */
interface Callback<in T> {
    /**
     * The request and post processing operations were successful resulting in the serialization
     * of the provided associated data
     *
     * @param response The serialization of the provided associated data
     */
    fun success(response: Response<T>)

    /**
     * The request encountered an error resulting in a failure
     *
     * @param response The serialization of an error which represents in [ApiError]
     */
    fun fail(response: Response<ApiError>)
}