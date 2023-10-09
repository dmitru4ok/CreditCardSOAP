package com.xignite.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-10-09T11:00:48.339+03:00
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://www.xignite.com/services/", name = "XigniteCurrenciesHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface XigniteCurrenciesHttpPost {

    /**
     * This operation returns a complete range of stock quotes for a currency pair.
     *             
     */
    @WebMethod(operationName = "GetHistoricalMonthlyCrossRatesRange")
    @WebResult(name = "FullHistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public FullHistoricalCrossRates getHistoricalMonthlyCrossRatesRange(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Draw a historical currency chart for a date range.
     */
    @WebMethod(operationName = "GetCurrencyChart")
    @WebResult(name = "HistoricalChart", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HistoricalChart getCurrencyChart(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "PeriodType", name = "PeriodType", targetNamespace = "")
        java.lang.String periodType,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(partName = "Style", name = "Style", targetNamespace = "")
        java.lang.String style,
        @WebParam(partName = "Width", name = "Width", targetNamespace = "")
        java.lang.String width,
        @WebParam(partName = "Height", name = "Height", targetNamespace = "")
        java.lang.String height,
        @WebParam(partName = "Preset", name = "Preset", targetNamespace = "")
        java.lang.String preset
    );

    /**
     * This operation returns a range of cross-rates for a currency pair.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRatesAsOf")
    @WebResult(name = "HistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HistoricalCrossRates getHistoricalCrossRatesAsOf(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(partName = "PeriodType", name = "PeriodType", targetNamespace = "")
        java.lang.String periodType,
        @WebParam(partName = "Periods", name = "Periods", targetNamespace = "")
        java.lang.String periods
    );

    /**
     * Draw a intraday currency chart for a time range
     */
    @WebMethod(operationName = "GetCurrencyIntradayChart")
    @WebResult(name = "CurrencyChartIntraday", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CurrencyChartIntraday getCurrencyIntradayChart(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartTime", name = "StartTime", targetNamespace = "")
        java.lang.String startTime,
        @WebParam(partName = "EndTime", name = "EndTime", targetNamespace = "")
        java.lang.String endTime,
        @WebParam(partName = "TimeZone", name = "TimeZone", targetNamespace = "")
        java.lang.String timeZone,
        @WebParam(partName = "Style", name = "Style", targetNamespace = "")
        java.lang.String style,
        @WebParam(partName = "Width", name = "Width", targetNamespace = "")
        java.lang.String width,
        @WebParam(partName = "Height", name = "Height", targetNamespace = "")
        java.lang.String height,
        @WebParam(partName = "PeriodType", name = "PeriodType", targetNamespace = "")
        java.lang.String periodType,
        @WebParam(partName = "TickPeriods", name = "TickPeriods", targetNamespace = "")
        java.lang.String tickPeriods,
        @WebParam(partName = "Preset", name = "Preset", targetNamespace = "")
        java.lang.String preset
    );

    /**
     * Convert value from one currency to another in real-time.
     *             
     */
    @WebMethod(operationName = "ConvertRealTimeValue")
    @WebResult(name = "ExchangeConversion", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ExchangeConversion convertRealTimeValue(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to,
        @WebParam(partName = "Amount", name = "Amount", targetNamespace = "")
        java.lang.String amount
    );

    /**
     * Returns all valid cross rates for a currency.
     */
    @WebMethod(operationName = "GetAllCrossRatesForACurrency")
    @WebResult(name = "CrossRateTableLineWithBidAsk", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateTableLineWithBidAsk getAllCrossRatesForACurrency(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    /**
     * Returns historical currency cross-rate tables for a range of dates.
     *             
     */
    @WebMethod(operationName = "GetCurrencyReport")
    @WebResult(name = "Report", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public Report getCurrencyReport(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Returns an official cross-rate as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetOfficialCrossRates")
    @WebResult(name = "ArrayOfHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfHistoricalCrossRate getOfficialCrossRates(

        @WebParam(partName = "CountryType", name = "CountryType", targetNamespace = "")
        java.lang.String countryType,
        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a real-time currency cross-rate.
     */
    @WebMethod(operationName = "GetRealTimeCrossRate")
    @WebResult(name = "CrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRate getRealTimeCrossRate(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * Returns the latest possible cross rate.
     */
    @WebMethod(operationName = "GetLatestCrossRate")
    @WebResult(name = "CrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRate getLatestCrossRate(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * Returns an official cross-rate as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetOfficialCrossRateBidAsk")
    @WebResult(name = "FullHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public FullHistoricalCrossRate getOfficialCrossRateBidAsk(

        @WebParam(partName = "CountryType", name = "CountryType", targetNamespace = "")
        java.lang.String countryType,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns multiple cross-rates as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetMutipleHistoricalCrossRates")
    @WebResult(name = "MultipleHistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public MultipleHistoricalCrossRates getMutipleHistoricalCrossRates(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns the default design class for the currency Chart.
     *             
     */
    @WebMethod(operationName = "GetChartDesign")
    @WebResult(name = "ChartDesign", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ChartDesign getChartDesign()
;

    /**
     * Convert value from one currency to another as of a historical date.
     *             
     */
    @WebMethod(operationName = "ConvertHistoricalValue")
    @WebResult(name = "ExchangeConversion", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ExchangeConversion convertHistoricalValue(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate,
        @WebParam(partName = "Amount", name = "Amount", targetNamespace = "")
        java.lang.String amount
    );

    /**
     * List supported official rates.
     */
    @WebMethod(operationName = "ListOfficialRates")
    @WebResult(name = "OfficialRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public OfficialRates listOfficialRates()
;

    /**
     * Returns the high and the low ticks for a historical time range.
     *             
     */
    @WebMethod(operationName = "GetHistoricalHighLow")
    @WebResult(name = "HighLowTick", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HighLowTick getHistoricalHighLow(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDateTime", name = "StartDateTime", targetNamespace = "")
        java.lang.String startDateTime,
        @WebParam(partName = "EndDateTime", name = "EndDateTime", targetNamespace = "")
        java.lang.String endDateTime
    );

    /**
     * Returns a historical currency cross-rate table.
     */
    @WebMethod(operationName = "GetHistoricalCrossRateTable")
    @WebResult(name = "CrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateTable getHistoricalCrossRateTable(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a cross-rate as of a historical date.
     */
    @WebMethod(operationName = "GetHistoricalCrossRate")
    @WebResult(name = "HistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HistoricalCrossRate getHistoricalCrossRate(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a real-time currency cross-rate.
     */
    @WebMethod(operationName = "GetRawCrossRates")
    @WebResult(name = "ArrayOfCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfCrossRate getRawCrossRates(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols
    );

    /**
     * Returns a historical currency cross-rate table.
     */
    @WebMethod(operationName = "GetHistoricalCrossRateTableBidAsk")
    @WebResult(name = "CrossRateTableWithBidAsk", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateTableWithBidAsk getHistoricalCrossRateTableBidAsk(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * List supported currencies.
     */
    @WebMethod(operationName = "ListCurrencies")
    @WebResult(name = "CurrencyList", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CurrencyList listCurrencies()
;

    /**
     * Returns the high and the low ticks for today.
     */
    @WebMethod(operationName = "GetIntradayHighLow")
    @WebResult(name = "HighLowTick", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HighLowTick getIntradayHighLow(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDateTime", name = "StartDateTime", targetNamespace = "")
        java.lang.String startDateTime,
        @WebParam(partName = "EndDateTime", name = "EndDateTime", targetNamespace = "")
        java.lang.String endDateTime
    );

    /**
     * Returns a set of real-time currency forward rates.
     */
    @WebMethod(operationName = "GetRealTimeForwardRate")
    @WebResult(name = "ForwardRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ForwardRate getRealTimeForwardRate(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * Returns multiple cross-rates as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRates")
    @WebResult(name = "ArrayOfHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfHistoricalCrossRate getHistoricalCrossRates(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a real-time currency cross-rate table.
     */
    @WebMethod(operationName = "GetRealTimeCrossRateTableWithBidAsk")
    @WebResult(name = "CrossRateTableWithBidAsk", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateTableWithBidAsk getRealTimeCrossRateTableWithBidAsk(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols
    );

    /**
     * Returns historical currency cross-rate tables for a range of dates.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRateTablesBidAsk")
    @WebResult(name = "ArrayOfCrossRateTableWithBidAsk", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfCrossRateTableWithBidAsk getHistoricalCrossRateTablesBidAsk(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Returns a range of ticks for a currency pair.
     */
    @WebMethod(operationName = "GetHistoricalTicks")
    @WebResult(name = "Ticks", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public Ticks getHistoricalTicks(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartTime", name = "StartTime", targetNamespace = "")
        java.lang.String startTime,
        @WebParam(partName = "EndTime", name = "EndTime", targetNamespace = "")
        java.lang.String endTime,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate,
        @WebParam(partName = "TickPrecision", name = "TickPrecision", targetNamespace = "")
        java.lang.String tickPrecision,
        @WebParam(partName = "TickPeriods", name = "TickPeriods", targetNamespace = "")
        java.lang.String tickPeriods
    );

    /**
     * Returns a cross-rate with bid/ask as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRateBidAsk")
    @WebResult(name = "FullHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public FullHistoricalCrossRate getHistoricalCrossRateBidAsk(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Get Unit Of Account.
     */
    @WebMethod(operationName = "GetUnitOfAccount")
    @WebResult(name = "UnitOfAccount", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public UnitOfAccount getUnitOfAccount(

        @WebParam(partName = "Currency", name = "Currency", targetNamespace = "")
        java.lang.String currency,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a tick for a currency pair as of a specific time in the day.
     *             
     */
    @WebMethod(operationName = "GetTick")
    @WebResult(name = "SingleTick", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public SingleTick getTick(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "Time", name = "Time", targetNamespace = "")
        java.lang.String time
    );

    /**
     * This operation returns a range of cross-rates for a currency pair.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRatesBidAskAsOf")
    @WebResult(name = "FullHistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public FullHistoricalCrossRates getHistoricalCrossRatesBidAskAsOf(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(partName = "PeriodType", name = "PeriodType", targetNamespace = "")
        java.lang.String periodType,
        @WebParam(partName = "Periods", name = "Periods", targetNamespace = "")
        java.lang.String periods
    );

    /**
     * This operation returns an array average daily historical cross-rates for a period.
     *             
     */
    @WebMethod(operationName = "GetAverageHistoricalCrossRates")
    @WebResult(name = "ArrayOfAverageHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfAverageHistoricalCrossRate getAverageHistoricalCrossRates(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Returns a real-time currency cross-rate table as an HTML Output.
     *             
     */
    @WebMethod(operationName = "GetSimpleRealTimeCrossRateTableAsHTML")
    @WebResult(name = "HTMLCrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HTMLCrossRateTable getSimpleRealTimeCrossRateTableAsHTML(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "ColumnHeaderStyle", name = "ColumnHeaderStyle", targetNamespace = "")
        java.lang.String columnHeaderStyle,
        @WebParam(partName = "LineHeaderStyle", name = "LineHeaderStyle", targetNamespace = "")
        java.lang.String lineHeaderStyle,
        @WebParam(partName = "CellStyle", name = "CellStyle", targetNamespace = "")
        java.lang.String cellStyle
    );

    /**
     * Returns a real-time currency cross-rate with the times in GMT.
     *             
     */
    @WebMethod(operationName = "GetRealTimeCrossRateGMT")
    @WebResult(name = "CrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRate getRealTimeCrossRateGMT(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * Returns the latest possible cross rate.
     */
    @WebMethod(operationName = "GetRealTimeCrossRates")
    @WebResult(name = "ArrayOfCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfCrossRate getRealTimeCrossRates(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols
    );

    /**
     * Returns historical currency cross-rate tables for a range of dates.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRateTables")
    @WebResult(name = "ArrayOfCrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfCrossRateTable getHistoricalCrossRateTables(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * This operation returns the changes in a cross-rates over the last 6 months.
     *             
     */
    @WebMethod(operationName = "GetCrossRateChange")
    @WebResult(name = "CrossRateChange", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateChange getCrossRateChange(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    /**
     * Returns a real-time currency cross-rate table.
     */
    @WebMethod(operationName = "GetRealTimeCrossRateTable")
    @WebResult(name = "CrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRateTable getRealTimeCrossRateTable(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols
    );

    /**
     * Returns an official cross-rate as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetOfficialCrossRatesBidAsk")
    @WebResult(name = "ArrayOfFullHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfFullHistoricalCrossRate getOfficialCrossRatesBidAsk(

        @WebParam(partName = "CountryType", name = "CountryType", targetNamespace = "")
        java.lang.String countryType,
        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * Returns a historical currency cross-rate table as an HTML Output.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRateTableAsHTML")
    @WebResult(name = "HTMLCrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HTMLCrossRateTable getHistoricalCrossRateTableAsHTML(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate,
        @WebParam(partName = "ColumnHeaderStyle", name = "ColumnHeaderStyle", targetNamespace = "")
        java.lang.String columnHeaderStyle,
        @WebParam(partName = "LineHeaderStyle", name = "LineHeaderStyle", targetNamespace = "")
        java.lang.String lineHeaderStyle,
        @WebParam(partName = "CellStyle", name = "CellStyle", targetNamespace = "")
        java.lang.String cellStyle
    );

    /**
     * Returns a real-time currency cross-rate table as an HTML Output.
     *             
     */
    @WebMethod(operationName = "GetRealTimeCrossRateTableAsHTML")
    @WebResult(name = "HTMLCrossRateTable", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HTMLCrossRateTable getRealTimeCrossRateTableAsHTML(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "ColumnHeaderStyle", name = "ColumnHeaderStyle", targetNamespace = "")
        java.lang.String columnHeaderStyle,
        @WebParam(partName = "LineHeaderStyle", name = "LineHeaderStyle", targetNamespace = "")
        java.lang.String lineHeaderStyle,
        @WebParam(partName = "CellStyle", name = "CellStyle", targetNamespace = "")
        java.lang.String cellStyle
    );

    /**
     * Returns multiple cross-rates with bid/ask as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRatesBidAsk")
    @WebResult(name = "ArrayOfFullHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfFullHistoricalCrossRate getHistoricalCrossRatesBidAsk(

        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * This operation returns a range of cross-rates for a currency pair.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRatesRange")
    @WebResult(name = "HistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HistoricalCrossRates getHistoricalCrossRatesRange(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * This operation returns an average daily historical cross-rates for a period.
     *             
     */
    @WebMethod(operationName = "GetAverageHistoricalCrossRate")
    @WebResult(name = "AverageHistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public AverageHistoricalCrossRate getAverageHistoricalCrossRate(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Draw a historical currency chart for a date range in binary format.
     *             
     */
    @WebMethod(operationName = "GetCurrencyChartBinary")
    @WebResult(name = "ChartBinary", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ChartBinary getCurrencyChartBinary(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "PeriodType", name = "PeriodType", targetNamespace = "")
        java.lang.String periodType,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(partName = "Style", name = "Style", targetNamespace = "")
        java.lang.String style,
        @WebParam(partName = "Width", name = "Width", targetNamespace = "")
        java.lang.String width,
        @WebParam(partName = "Height", name = "Height", targetNamespace = "")
        java.lang.String height,
        @WebParam(partName = "Preset", name = "Preset", targetNamespace = "")
        java.lang.String preset
    );

    /**
     * Returns a range of ticks for a currency pair.
     */
    @WebMethod(operationName = "GetTicks")
    @WebResult(name = "Ticks", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public Ticks getTicks(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartTime", name = "StartTime", targetNamespace = "")
        java.lang.String startTime,
        @WebParam(partName = "EndTime", name = "EndTime", targetNamespace = "")
        java.lang.String endTime,
        @WebParam(partName = "TickPrecision", name = "TickPrecision", targetNamespace = "")
        java.lang.String tickPrecision,
        @WebParam(partName = "TickPeriods", name = "TickPeriods", targetNamespace = "")
        java.lang.String tickPeriods
    );

    /**
     * Returns a real-time currency cross-rate.
     */
    @WebMethod(operationName = "GetRawCrossRate")
    @WebResult(name = "CrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRate getRawCrossRate(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * This operation returns a range of cross-rates for a currency pair.
     *             
     */
    @WebMethod(operationName = "GetHistoricalCrossRatesBidAskRange")
    @WebResult(name = "FullHistoricalCrossRates", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public FullHistoricalCrossRates getHistoricalCrossRatesBidAskRange(

        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate
    );

    /**
     * Returns an official cross-rate as of a historical date.
     *             
     */
    @WebMethod(operationName = "GetOfficialCrossRate")
    @WebResult(name = "HistoricalCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public HistoricalCrossRate getOfficialCrossRate(

        @WebParam(partName = "CountryType", name = "CountryType", targetNamespace = "")
        java.lang.String countryType,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "AsOfDate", name = "AsOfDate", targetNamespace = "")
        java.lang.String asOfDate
    );

    /**
     * List supported currencies.
     */
    @WebMethod(operationName = "ListActiveCurrencies")
    @WebResult(name = "CurrencyList", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CurrencyList listActiveCurrencies()
;

    /**
     * Returns a real-time currency cross-rate.
     */
    @WebMethod(operationName = "GetRealTimeCrossRateAsString")
    @WebResult(name = "CrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public CrossRate getRealTimeCrossRateAsString(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "To", name = "To", targetNamespace = "")
        java.lang.String to
    );

    /**
     * Returns the latest possible cross rate.
     */
    @WebMethod(operationName = "GetLatestCrossRates")
    @WebResult(name = "ArrayOfCrossRate", targetNamespace = "http://www.xignite.com/services/", partName = "Body")
    public ArrayOfCrossRate getLatestCrossRates(

        @WebParam(partName = "From", name = "From", targetNamespace = "")
        java.lang.String from,
        @WebParam(partName = "Tos", name = "Tos", targetNamespace = "")
        java.lang.String tos
    );
}
