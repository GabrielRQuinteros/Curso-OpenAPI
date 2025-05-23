/**
 * GabyCursoOpenAPI
 * Especificacion de OpenAPi para el Curso
 *
 * OpenAPI spec version: 1.0
 * Contact: QuinterosGabrielRoberto@hotmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { Beer } from '../model/beer';
import { BeerPageList } from '../model/beerPageList';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class BeersService {

    protected basePath = 'https://dev.mi-aplicacion.com/api';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * Crear Cerveza
     * Crea una cerveza
     * @param body Informacion de la cerveza
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createBeerV1(body: Beer, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public createBeerV1(body: Beer, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public createBeerV1(body: Beer, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public createBeerV1(body: Beer, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling createBeerV1.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWTAuthToken) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/v1/beers`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Eliminar Cerveza por Id
     * Elimina del Sistema una Cerveza segun su Id
     * @param beerId Id de Cerveza
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteBeerV1(beerId: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteBeerV1(beerId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteBeerV1(beerId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteBeerV1(beerId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (beerId === null || beerId === undefined) {
            throw new Error('Required parameter beerId was null or undefined when calling deleteBeerV1.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWTAuthToken) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('delete',`${this.basePath}/v1/beers/${encodeURIComponent(String(beerId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Obtener Cerveza por Id
     * Obtiene una ***Cerveza*** cuyo id sea el  suministrado.
     * @param beerId Id de Cerveza
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getBeerByIdV1(beerId: string, observe?: 'body', reportProgress?: boolean): Observable<Beer>;
    public getBeerByIdV1(beerId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Beer>>;
    public getBeerByIdV1(beerId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Beer>>;
    public getBeerByIdV1(beerId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (beerId === null || beerId === undefined) {
            throw new Error('Required parameter beerId was null or undefined when calling getBeerByIdV1.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWTAuthToken) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Beer>('get',`${this.basePath}/v1/beers/${encodeURIComponent(String(beerId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Obtener Lista de Cervezas
     * Devuelve una Lista de Cervezas paginada por tamaño y número de pagina.
     * @param pageNumber Numero de Pagina
     * @param pageSize Tamaño de Pagina
     * @param deprecatedParameter Prueba de un Parametro deprecado
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public listBeersV1(pageNumber?: number, pageSize?: number, deprecatedParameter?: string, observe?: 'body', reportProgress?: boolean): Observable<BeerPageList>;
    public listBeersV1(pageNumber?: number, pageSize?: number, deprecatedParameter?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<BeerPageList>>;
    public listBeersV1(pageNumber?: number, pageSize?: number, deprecatedParameter?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<BeerPageList>>;
    public listBeersV1(pageNumber?: number, pageSize?: number, deprecatedParameter?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {




        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (pageNumber !== undefined && pageNumber !== null) {
            queryParameters = queryParameters.set('pageNumber', <any>pageNumber);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }
        if (deprecatedParameter !== undefined && deprecatedParameter !== null) {
            queryParameters = queryParameters.set('deprecated-parameter', <any>deprecatedParameter);
        }

        let headers = this.defaultHeaders;

        // authentication (JWTAuthToken) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<BeerPageList>('get',`${this.basePath}/v1/beers`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Actualizar Cerveza
     * Actualiza la informacion de una Cerveza
     * @param body Informacion de la cerveza
     * @param beerId Id de Cerveza
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateBeerV1(body: Beer, beerId: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public updateBeerV1(body: Beer, beerId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public updateBeerV1(body: Beer, beerId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public updateBeerV1(body: Beer, beerId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling updateBeerV1.');
        }

        if (beerId === null || beerId === undefined) {
            throw new Error('Required parameter beerId was null or undefined when calling updateBeerV1.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWTAuthToken) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('put',`${this.basePath}/v1/beers/${encodeURIComponent(String(beerId))}`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
