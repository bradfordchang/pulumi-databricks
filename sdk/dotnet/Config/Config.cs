// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Databricks
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly Pulumi.Config __config = new Pulumi.Config("databricks");

        private static readonly __Value<string?> _accountId = new __Value<string?>(() => __config.Get("accountId"));
        public static string? AccountId
        {
            get => _accountId.Get();
            set => _accountId.Set(value);
        }

        private static readonly __Value<string?> _authType = new __Value<string?>(() => __config.Get("authType"));
        public static string? AuthType
        {
            get => _authType.Get();
            set => _authType.Set(value);
        }

        private static readonly __Value<string?> _azureClientId = new __Value<string?>(() => __config.Get("azureClientId"));
        public static string? AzureClientId
        {
            get => _azureClientId.Get();
            set => _azureClientId.Set(value);
        }

        private static readonly __Value<string?> _azureClientSecret = new __Value<string?>(() => __config.Get("azureClientSecret"));
        public static string? AzureClientSecret
        {
            get => _azureClientSecret.Get();
            set => _azureClientSecret.Set(value);
        }

        private static readonly __Value<string?> _azureEnvironment = new __Value<string?>(() => __config.Get("azureEnvironment"));
        public static string? AzureEnvironment
        {
            get => _azureEnvironment.Get();
            set => _azureEnvironment.Set(value);
        }

        private static readonly __Value<string?> _azureLoginAppId = new __Value<string?>(() => __config.Get("azureLoginAppId"));
        public static string? AzureLoginAppId
        {
            get => _azureLoginAppId.Get();
            set => _azureLoginAppId.Set(value);
        }

        private static readonly __Value<string?> _azureTenantId = new __Value<string?>(() => __config.Get("azureTenantId"));
        public static string? AzureTenantId
        {
            get => _azureTenantId.Get();
            set => _azureTenantId.Set(value);
        }

        private static readonly __Value<bool?> _azureUseMsi = new __Value<bool?>(() => __config.GetBoolean("azureUseMsi"));
        public static bool? AzureUseMsi
        {
            get => _azureUseMsi.Get();
            set => _azureUseMsi.Set(value);
        }

        private static readonly __Value<string?> _azureWorkspaceResourceId = new __Value<string?>(() => __config.Get("azureWorkspaceResourceId"));
        public static string? AzureWorkspaceResourceId
        {
            get => _azureWorkspaceResourceId.Get();
            set => _azureWorkspaceResourceId.Set(value);
        }

        private static readonly __Value<string?> _configFile = new __Value<string?>(() => __config.Get("configFile"));
        public static string? ConfigFile
        {
            get => _configFile.Get();
            set => _configFile.Set(value);
        }

        private static readonly __Value<bool?> _debugHeaders = new __Value<bool?>(() => __config.GetBoolean("debugHeaders"));
        public static bool? DebugHeaders
        {
            get => _debugHeaders.Get();
            set => _debugHeaders.Set(value);
        }

        private static readonly __Value<int?> _debugTruncateBytes = new __Value<int?>(() => __config.GetInt32("debugTruncateBytes"));
        public static int? DebugTruncateBytes
        {
            get => _debugTruncateBytes.Get();
            set => _debugTruncateBytes.Set(value);
        }

        private static readonly __Value<string?> _googleCredentials = new __Value<string?>(() => __config.Get("googleCredentials"));
        public static string? GoogleCredentials
        {
            get => _googleCredentials.Get();
            set => _googleCredentials.Set(value);
        }

        private static readonly __Value<string?> _googleServiceAccount = new __Value<string?>(() => __config.Get("googleServiceAccount"));
        public static string? GoogleServiceAccount
        {
            get => _googleServiceAccount.Get();
            set => _googleServiceAccount.Set(value);
        }

        private static readonly __Value<string?> _host = new __Value<string?>(() => __config.Get("host"));
        public static string? Host
        {
            get => _host.Get();
            set => _host.Set(value);
        }

        private static readonly __Value<int?> _httpTimeoutSeconds = new __Value<int?>(() => __config.GetInt32("httpTimeoutSeconds"));
        public static int? HttpTimeoutSeconds
        {
            get => _httpTimeoutSeconds.Get();
            set => _httpTimeoutSeconds.Set(value);
        }

        private static readonly __Value<string?> _password = new __Value<string?>(() => __config.Get("password"));
        public static string? Password
        {
            get => _password.Get();
            set => _password.Set(value);
        }

        private static readonly __Value<string?> _profile = new __Value<string?>(() => __config.Get("profile"));
        public static string? Profile
        {
            get => _profile.Get();
            set => _profile.Set(value);
        }

        private static readonly __Value<int?> _rateLimit = new __Value<int?>(() => __config.GetInt32("rateLimit"));
        public static int? RateLimit
        {
            get => _rateLimit.Get();
            set => _rateLimit.Set(value);
        }

        private static readonly __Value<bool?> _skipVerify = new __Value<bool?>(() => __config.GetBoolean("skipVerify"));
        public static bool? SkipVerify
        {
            get => _skipVerify.Get();
            set => _skipVerify.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

        private static readonly __Value<string?> _username = new __Value<string?>(() => __config.Get("username"));
        public static string? Username
        {
            get => _username.Get();
            set => _username.Set(value);
        }

    }
}
