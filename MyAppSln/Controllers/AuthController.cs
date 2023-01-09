using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using MyAppSln.Models;

namespace MyAppSln.Controllers;
public class AuthController : Controller
{
    private readonly ILogger<AuthController> _logger;

    public AuthController(ILogger<AuthController> logger)
    {
        _logger = logger;
    }
    public IActionResult Login()
    {
        return View();
    }
    public IActionResult Register()
    {
        return View();
    }
    public IActionResult Reg()
    {
        return View();
    }
    public IActionResult Display()
    {
        return View();
    }
}