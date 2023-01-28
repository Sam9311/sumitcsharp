using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using MyFirstApp.Models;

namespace MyFirstApp.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }


 public IActionResult Login()
    {
        return View();
    }

 public IActionResult Register()
    {
        Console.WriteLine("abcdef");
        return View();
    }
public IActionResult Homes()
    {
        Console.WriteLine("abcdef");
        return View();
    }

 public IActionResult TeacherInfo()
    {
        return View();
    }

 public IActionResult Display()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
