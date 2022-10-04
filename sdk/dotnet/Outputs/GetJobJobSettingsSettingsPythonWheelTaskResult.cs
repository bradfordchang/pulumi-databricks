// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsPythonWheelTaskResult
    {
        public readonly string? EntryPoint;
        public readonly ImmutableDictionary<string, object>? NamedParameters;
        public readonly string? PackageName;
        public readonly ImmutableArray<string> Parameters;

        [OutputConstructor]
        private GetJobJobSettingsSettingsPythonWheelTaskResult(
            string? entryPoint,

            ImmutableDictionary<string, object>? namedParameters,

            string? packageName,

            ImmutableArray<string> parameters)
        {
            EntryPoint = entryPoint;
            NamedParameters = namedParameters;
            PackageName = packageName;
            Parameters = parameters;
        }
    }
}
