/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.digitalstrom.internal.lib.serverConnection;

/**
 * The {@link HttpTransport} executes an request to the DigitalSTROM-Server.
 *
 * @author Michael Ochel - Initial contribution
 * @author Matthias Siegele - Initial contribution
 */
public interface HttpTransport {

    /**
     * Executes a digitalSTROM-request through calling {@link #execute(String, int, int)} with default connection time
     * out and read timeout.
     *
     * @param request to execute
     * @return response
     */
    String execute(String request);

    /**
     * Executes a digitalSTROM-request.
     *
     * @param request to execute
     * @param connectTimeout of execution
     * @param readTimeout of execution
     * @return response
     */
    String execute(String request, int connectTimeout, int readTimeout);

    /**
     * Executes a digitalSTROM test request and returns the HTTP-Code.
     *
     * @param testRequest to execute
     * @return HTTP-Code
     */
    int checkConnection(String testRequest);

    /**
     * Returns the connection timeout for sensor data readings.
     *
     * @return sensor data connection timeout
     */
    int getSensordataConnectionTimeout();

    /**
     * Returns the read timeout for sensor data readings.
     *
     * @return sensor data read timeout
     */
    int getSensordataReadTimeout();

    /**
     * Saves the SSL-Certificate in a file at the given path.
     *
     * @param path to save
     * @return absolute path
     */
    String writePEMCertFile(String path);
}
