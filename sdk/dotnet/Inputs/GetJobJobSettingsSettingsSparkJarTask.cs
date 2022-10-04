// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsSparkJarTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("jarUri")]
        public string? JarUri { get; set; }

        [Input("mainClassName")]
        public string? MainClassName { get; set; }

        [Input("parameters")]
        private List<string>? _parameters;
        public List<string> Parameters
        {
            get => _parameters ?? (_parameters = new List<string>());
            set => _parameters = value;
        }

        public GetJobJobSettingsSettingsSparkJarTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsSparkJarTaskArgs Empty => new GetJobJobSettingsSettingsSparkJarTaskArgs();
    }
}
