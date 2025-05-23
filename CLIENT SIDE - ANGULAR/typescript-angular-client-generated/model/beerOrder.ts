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
 */
import { BeerOrderLine } from './beerOrderLine';

export interface BeerOrder { 
    readonly id?: string;
    customerId: string;
    customerRef?: string;
    beerOrderLines?: Array<BeerOrderLine>;
    orderStatusCallbackUrl?: string;
}