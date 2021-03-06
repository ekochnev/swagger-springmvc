package com.mangofactory.swagger.models.dto.builder;

import com.mangofactory.swagger.models.dto.TokenRequestEndpoint;

public class TokenRequestEndpointBuilder {
  private String url;
  private String clientIdName;
  private String clientSecretName;

  public TokenRequestEndpointBuilder url(String url) {
    this.url = url;
    return this;
  }

  public TokenRequestEndpointBuilder clientIdName(String clientIdName) {
    this.clientIdName = clientIdName;
    return this;
  }

  public TokenRequestEndpointBuilder clientSecretName(String clientSecretName) {
    this.clientSecretName = clientSecretName;
    return this;
  }

  public TokenRequestEndpoint build() {
    return new TokenRequestEndpoint(url, clientIdName, clientSecretName);
  }
}