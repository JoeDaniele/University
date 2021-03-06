#pragma checksum "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "49005d601a4821ec45190c5b5f11e42308c0be94"
// <auto-generated/>
#pragma warning disable 1591
namespace Blazor_Server_Side_App.Pages
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Components;
#nullable restore
#line 1 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 8 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Blazor_Server_Side_App;

#line default
#line hidden
#nullable disable
#nullable restore
#line 9 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\_Imports.razor"
using Blazor_Server_Side_App.Shared;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
using Blazor_Server_Side_App.Data;

#line default
#line hidden
#nullable disable
    [Microsoft.AspNetCore.Components.RouteAttribute("/fetchdata")]
    public partial class FetchData : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
            __builder.AddMarkupContent(0, "                                               //for weather service\r\n\r\n");
            __builder.AddMarkupContent(1, "<h1>Weather forecast</h1>\r\n\r\n");
            __builder.AddMarkupContent(2, "<p>This component demonstrates fetching data from a service.</p>\r\n\r\n");
#nullable restore
#line 11 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
 if (forecasts == null) // if forecasts is not yet instantiated 
{

#line default
#line hidden
#nullable disable
            __builder.AddContent(3, "    ");
            __builder.AddMarkupContent(4, "<p><em>Loading...</em></p> ");
#nullable restore
#line 13 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
                               //if null show a loading indicator
    //could create a gif for loading -- where would it go?

}
else
{

#line default
#line hidden
#nullable disable
            __builder.AddContent(5, "    ");
            __builder.OpenElement(6, "table");
            __builder.AddAttribute(7, "class", "table");
            __builder.AddMarkupContent(8, " //creates a table\r\n        ");
            __builder.AddMarkupContent(9, "<thead>\r\n            <tr>\r\n                <th>Date</th>\r\n                <th>Temp. (C)</th>\r\n                <th>Temp. (F)</th>\r\n                <th>Summary</th>\r\n            </tr>\r\n        </thead>\r\n        ");
            __builder.OpenElement(10, "tbody");
            __builder.AddMarkupContent(11, "\r\n");
#nullable restore
#line 29 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
             foreach (var forecast in forecasts)
            {

#line default
#line hidden
#nullable disable
            __builder.AddContent(12, "                ");
            __builder.OpenElement(13, "tr");
            __builder.AddMarkupContent(14, "\r\n                    ");
            __builder.OpenElement(15, "td");
#nullable restore
#line 32 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
__builder.AddContent(16, forecast.Date.ToShortDateString());

#line default
#line hidden
#nullable disable
            __builder.CloseElement();
            __builder.AddMarkupContent(17, "\r\n                    ");
            __builder.OpenElement(18, "td");
#nullable restore
#line 33 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
__builder.AddContent(19, forecast.TemperatureC);

#line default
#line hidden
#nullable disable
            __builder.CloseElement();
            __builder.AddMarkupContent(20, "\r\n                    ");
            __builder.OpenElement(21, "td");
#nullable restore
#line 34 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
__builder.AddContent(22, forecast.TemperatureF);

#line default
#line hidden
#nullable disable
            __builder.CloseElement();
            __builder.AddMarkupContent(23, "\r\n                    ");
            __builder.OpenElement(24, "td");
#nullable restore
#line 35 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
__builder.AddContent(25, forecast.Summary);

#line default
#line hidden
#nullable disable
            __builder.CloseElement();
            __builder.AddMarkupContent(26, "\r\n                ");
            __builder.CloseElement();
            __builder.AddMarkupContent(27, "\r\n");
#nullable restore
#line 37 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
            }

#line default
#line hidden
#nullable disable
            __builder.AddContent(28, "        ");
            __builder.CloseElement();
            __builder.AddMarkupContent(29, "\r\n    ");
            __builder.CloseElement();
            __builder.AddMarkupContent(30, "\r\n");
#nullable restore
#line 40 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
}

#line default
#line hidden
#nullable disable
        }
        #pragma warning restore 1998
#nullable restore
#line 42 "C:\Misc\GithubMain\C# Studio\Blazor App\Blazor Server Side App\Blazor Server Side App\Pages\FetchData.razor"
       
    private WeatherForecast[] forecasts;

    protected override async Task OnInitializedAsync()
    {
        forecasts = await ForecastService.GetForecastAsync(DateTime.Now);
    }

#line default
#line hidden
#nullable disable
        [global::Microsoft.AspNetCore.Components.InjectAttribute] private WeatherForecastService ForecastService { get; set; }
    }
}
#pragma warning restore 1591
