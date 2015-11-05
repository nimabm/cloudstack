//Licensed to the Apache Software Foundation (ASF) under one
//or more contributor license agreements.  See the NOTICE file
//distributed with this work for additional information
//regarding copyright ownership.  The ASF licenses this file
//to you under the Apache License, Version 2.0 (the
//"License"); you may not use this file except in compliance
//with the License.  You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing,
//software distributed under the License is distributed on an
//"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//KIND, either express or implied.  See the License for the
//specific language governing permissions and limitations
//under the License.
package org.apache.cloudstack.api.response;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import org.apache.cloudstack.api.BaseResponse;

import com.cloud.serializer.Param;

public class QuotaSummaryResponse extends BaseResponse {

    @SerializedName("accountid")
    @Param(description = "account id")
    private Long accountId;

    @SerializedName("account")
    @Param(description = "account name")
    private String accountName;

    @SerializedName("domain")
    @Param(description = "domain id")
    private Long domainId;

    @SerializedName("balance")
    @Param(description = "account balance")
    private BigDecimal balance;

    @SerializedName("quota")
    @Param(description = "quota usage of this period")
    private BigDecimal quotaUsage;

    @SerializedName("startdate")
    @Param(description = "start date")
    private Date startDate = null;

    @SerializedName("enddate")
    @Param(description = "end date")
    private Date endDate = null;

    @SerializedName("currency")
    @Param(description = "currency")
    private String currency;

    public QuotaSummaryResponse() {
        super();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public BigDecimal getQuotaUsage() {
        return quotaUsage;
    }

    public void setQuotaUsage(BigDecimal startQuota) {
        this.quotaUsage = startQuota.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal endQuota) {
        this.balance = endQuota.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
