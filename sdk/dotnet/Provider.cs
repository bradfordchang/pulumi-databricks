// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// The provider type for the databricks package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [DatabricksResourceType("pulumi:providers:databricks")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        [Output("authType")]
        public Output<string?> AuthType { get; private set; } = null!;

        [Output("azureClientId")]
        public Output<string?> AzureClientId { get; private set; } = null!;

        [Output("azureClientSecret")]
        public Output<string?> AzureClientSecret { get; private set; } = null!;

        [Output("azureEnvironment")]
        public Output<string?> AzureEnvironment { get; private set; } = null!;

        [Output("azureLoginAppId")]
        public Output<string?> AzureLoginAppId { get; private set; } = null!;

        [Output("azureTenantId")]
        public Output<string?> AzureTenantId { get; private set; } = null!;

        [Output("azureWorkspaceResourceId")]
        public Output<string?> AzureWorkspaceResourceId { get; private set; } = null!;

        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        [Output("clientSecret")]
        public Output<string?> ClientSecret { get; private set; } = null!;

        [Output("configFile")]
        public Output<string?> ConfigFile { get; private set; } = null!;

        [Output("databricksCliPath")]
        public Output<string?> DatabricksCliPath { get; private set; } = null!;

        [Output("googleCredentials")]
        public Output<string?> GoogleCredentials { get; private set; } = null!;

        [Output("googleServiceAccount")]
        public Output<string?> GoogleServiceAccount { get; private set; } = null!;

        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        [Output("metadataServiceUrl")]
        public Output<string?> MetadataServiceUrl { get; private set; } = null!;

        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        [Output("profile")]
        public Output<string?> Profile { get; private set; } = null!;

        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;

        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "azureClientSecret",
                    "clientSecret",
                    "googleCredentials",
                    "metadataServiceUrl",
                    "password",
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("azureClientId")]
        public Input<string>? AzureClientId { get; set; }

        [Input("azureClientSecret")]
        private Input<string>? _azureClientSecret;
        public Input<string>? AzureClientSecret
        {
            get => _azureClientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _azureClientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("azureEnvironment")]
        public Input<string>? AzureEnvironment { get; set; }

        [Input("azureLoginAppId")]
        public Input<string>? AzureLoginAppId { get; set; }

        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        [Input("azureUseMsi", json: true)]
        public Input<bool>? AzureUseMsi { get; set; }

        [Input("azureWorkspaceResourceId")]
        public Input<string>? AzureWorkspaceResourceId { get; set; }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("configFile")]
        public Input<string>? ConfigFile { get; set; }

        [Input("databricksCliPath")]
        public Input<string>? DatabricksCliPath { get; set; }

        [Input("debugHeaders", json: true)]
        public Input<bool>? DebugHeaders { get; set; }

        [Input("debugTruncateBytes", json: true)]
        public Input<int>? DebugTruncateBytes { get; set; }

        [Input("googleCredentials")]
        private Input<string>? _googleCredentials;
        public Input<string>? GoogleCredentials
        {
            get => _googleCredentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _googleCredentials = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("googleServiceAccount")]
        public Input<string>? GoogleServiceAccount { get; set; }

        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("httpTimeoutSeconds", json: true)]
        public Input<int>? HttpTimeoutSeconds { get; set; }

        [Input("metadataServiceUrl")]
        private Input<string>? _metadataServiceUrl;
        public Input<string>? MetadataServiceUrl
        {
            get => _metadataServiceUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _metadataServiceUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("profile")]
        public Input<string>? Profile { get; set; }

        [Input("rateLimit", json: true)]
        public Input<int>? RateLimit { get; set; }

        [Input("retryTimeoutSeconds", json: true)]
        public Input<int>? RetryTimeoutSeconds { get; set; }

        [Input("skipVerify", json: true)]
        public Input<bool>? SkipVerify { get; set; }

        [Input("token")]
        private Input<string>? _token;
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
